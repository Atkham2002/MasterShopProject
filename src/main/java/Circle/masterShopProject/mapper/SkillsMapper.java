package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.Skills;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillsMapper {

    SkillsDto toSkillsDto(Skills skills);

    Skills toSkills(SkillsDto skillsDto);

}
