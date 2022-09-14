package Circle.masterShopProject.service.helper;

import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.entity.MasterSkills;
import Circle.masterShopProject.mapper.MasterSkillsMapper;
import Circle.masterShopProject.repository.MasterSkillsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MasterSkillsHelper {

    private final EntityManager manager;

    private final MasterSkillsMapper mapper;

    public Page<MasterSkillsDto> searchByParams(Pageable pageable, MultiValueMap<String, String> map){
        StringBuilder builder = new StringBuilder();
        setConditions(builder, map);

        StringBuilder queryBody = new StringBuilder("SELECT * FROM master_skills WHERE 1=1");
        StringBuilder countBuilder = new StringBuilder("SELECT count(1) FROM master_skills WHERE 1=1");

        queryBody.append(builder);
        countBuilder.append(builder);

        Query query = manager.createNativeQuery(queryBody + "", MasterSkills.class);
        Query count = manager.createNativeQuery(countBuilder + "", Integer.class);

        setValues(query, map);
        setValues(count, map);

        Integer sum = count.getFirstResult();
        List<MasterSkills> list = query.getResultList();
        List<MasterSkillsDto> skillsDtoList = list.stream()
                .map(mapper::toDto).toList();

        return new PageImpl<>(skillsDtoList, pageable, sum);
    }

    private void setConditions(StringBuilder builder, MultiValueMap<String, String> map){
        if(map.containsKey("id")){
            builder.append(" AND id=:id");
        }
        if(map.containsKey("skills")){
            builder.append(" AND skills=:skills");
        }
        if(map.containsKey("client")){
            builder.append(" AND client=:id");
        }
        if(map.containsKey("price")){
            builder.append(" AND price=:price");
        }
        if(map.containsKey("experience")){
            builder.append(" AND experience=:experience");
        }
    }

    private void setValues(Query query, MultiValueMap<String, String> map){
        if(map.containsKey("id")){
            query.setParameter("id", map.getFirst("id"));
        }
        if(map.containsKey("skills")){
            query.setParameter("skills", map.getFirst("skills"));
        }
        if(map.containsKey("client")){
            query.setParameter("client", map.getFirst("client"));
        }
        if(map.containsKey("price")){
            query.setParameter("price", map.getFirst("price"));
        }
        if(map.containsKey("experience")){
            query.setParameter("experience", map.getFirst("experience"));
        }
    }
}
