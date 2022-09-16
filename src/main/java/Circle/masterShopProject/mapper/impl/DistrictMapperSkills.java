package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.entity.District;

public class DistrictMapperSkills
{
    public static DistrictDto toDistrictDto(District district){
        return DistrictDto.builder()
                .id(district.getId())
                .name(district.getName())
                .regionId(RegionMapperSkills.toRegionDtoNo(district.getRegionId()))
                .build();

    }
    public static DistrictDto toDistrictDtoNo(District district){
        return DistrictDto.builder()
                .id(district.getId())
                .name(district.getName())
                .build();
    }


}
