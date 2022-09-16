package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.entity.District;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DistrictMapper {
    District toEntity(DistrictDto districtDto);
    DistrictDto toDto(District district);
}
