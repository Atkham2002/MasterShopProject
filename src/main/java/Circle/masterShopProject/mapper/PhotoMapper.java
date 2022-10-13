package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.PhotoDto;
import Circle.masterShopProject.entity.Photo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    Photo toEntity(PhotoDto phoneDto);
    PhotoDto toDto(Photo phone);

}
