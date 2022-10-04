package Circle.masterShopProject.service.helper;

import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.Skills;
import Circle.masterShopProject.mapper.SkillsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SkillsHelper {

    private final SkillsMapper mapper;
    private final EntityManager manager;

    public Page<SkillsDto> searchByParams(Pageable pageable, MultiValueMap<String,String> map){
        StringBuilder builder = new StringBuilder();
        queryFill(builder,map);

        StringBuilder queryBody = new StringBuilder("SELECT * FROM skills WHERE 1=1");
        StringBuilder countBody = new StringBuilder("SELECT count(1) FROM skills WHERE 1=1");

        queryBody.append(builder);
        countBody.append(builder);

        Query query = manager.createQuery(queryBody + "", Skills.class);
        Query count = manager.createQuery(countBody + "",Integer.class);

        setValues(query,map);
        setValues(count,map);

        Integer sum = count.getFirstResult();
        List<Skills> skills = query.getResultList();
        List<SkillsDto> list = skills.stream()
                .map(mapper::toSkillsDto)
                .toList();

        return new PageImpl<>(list,pageable,sum);

    }

    private void queryFill(StringBuilder builder,MultiValueMap<String,String> map){
        if (map.containsKey("id"))
            builder.append("And id =: id");
        if (map.containsKey("name"))
            builder.append("And name =: name");
        if (map.containsKey("catalogId"))
            builder.append("And cataloId =: catalog_id");
    }

    private void setValues(Query query,MultiValueMap<String,String> map){
        if (map.containsKey("id"))
            query.setParameter("id",map.getFirst("id"));
        if (map.containsKey("name"))
            query.setParameter("name",map.getFirst("name"));
        if (map.containsKey("catalogId"))
            query.setParameter("catalog_id",map.getFirst("catalogId"));

    }

}
