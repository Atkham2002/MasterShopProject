package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.PhoneDto;
import Circle.masterShopProject.entity.Photo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    Photo toEntity(PhoneDto phoneDto);
    PhoneDto toDto(Photo phone);

}
