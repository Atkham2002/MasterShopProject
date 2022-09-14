package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.entity.MasterSkills;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MasterSkillsMapper {

    MasterSkills toEntity(MasterSkillsDto masterSkillsDto);

    MasterSkillsDto toDto(MasterSkills masterSkills);
}
