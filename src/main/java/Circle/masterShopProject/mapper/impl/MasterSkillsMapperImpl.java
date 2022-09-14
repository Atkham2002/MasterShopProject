package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.MasterSkills;
import Circle.masterShopProject.entity.Skills;

public class MasterSkillsMapperImpl {

    public static MasterSkills toEntityWithoutDetails(MasterSkillsDto masterSkillsDto){
        SkillsDto skillsDto = masterSkillsDto.getSkills();
        MasterSkills.builder()
                .id(masterSkillsDto.getId())
                .skills(Skills.builder()
                        .id(skillsDto.getId())
                        .name(skillsDto.getName())
                        .catalogId(null)
                        .build())
                .client(null)
                .build();

        return null;
    }
}
