package Circle.masterShopProject.service.helper;
import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.entity.District;
import Circle.masterShopProject.mapper.DistrictMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class DistrictHelper {
    private final DistrictMapper districtMapper;
    private final EntityManager entityManager;
    public Page<DistrictDto> byParams(PageRequest pageRequest, MultiValueMap<String,String> params){
        StringBuilder stringBuilder = new StringBuilder();

        String qurey = "select * from distric d where 1=1" + stringBuilder;
        String queryCount = "select count(1) from distric where 1=1 " + stringBuilder;

        queryBuilder(params,stringBuilder);

        Query query1 =  entityManager.createNativeQuery(qurey, District.class);
        Query queryCnt = entityManager.createNativeQuery(queryCount,Integer.class);

        setQuery(params,queryCnt);
        setQuery(params,query1);

        Integer count = queryCnt.getFirstResult();
        List<District>  districts = query1.getResultList();
        List<DistrictDto> districtDtos = districts.stream().map(districtMapper::toDto).collect(Collectors.toList());
        return new PageImpl(districtDtos,pageRequest,count);

    }
    private void queryBuilder(MultiValueMap<String,String > params,StringBuilder stringBuilder){
        if(params.containsKey("name")){
            stringBuilder.append(" AND d.name =: name");
        }
    }
    private void setQuery(MultiValueMap<String,String> params,Query query){
        if(params.containsKey("name")){
            query.setParameter("name",params.getFirst("name"));
        }
    }
}
