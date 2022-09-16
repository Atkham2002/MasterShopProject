package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.RegionDto;
import Circle.masterShopProject.entity.Region;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegionMapper {
    Region toEntity(RegionDto regionDto);
    RegionDto toDto(Region region);
}
