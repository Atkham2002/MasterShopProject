package Circle.masterShopProject.mapper.impl;
import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.RegionDto;
import Circle.masterShopProject.entity.Region;

import java.util.List;

public class RegionMapperSkills {
    public static RegionDto toRegionDto(Region region){
        List<DistrictDto> list = region.getDistricts().stream().map(DistrictMapperSkills::toDistrictDtoNo).toList();
        return RegionDto.builder()
                .id(region.getId())
                .name(region.getName())
                .districts(list)
                .build();
    }
    public static RegionDto toRegionDtoNo(Region region){
        return RegionDto.builder()
                .id(region.getId())
                .name(region.getName())
                .build();
    }
}
