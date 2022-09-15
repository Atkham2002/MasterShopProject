package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.Skills;

public class MapperSkills {

    public static SkillsDto toSkillsDto(Skills skills){
        return SkillsDto.builder()
                .id(skills.getId())
                .name(skills.getName())
                .catalogId(MapperCatalog.NoSkills(skills.getCatalogId()))
                .build();
    }

    public static SkillsDto NoCatalogId(Skills skills){
        return SkillsDto.builder()
                .id(skills.getId())
                .name(skills.getName())
                .build();
    }

}
