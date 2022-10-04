package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.VlogDto;
import Circle.masterShopProject.entity.Vlog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VlogMapper {
    Vlog toEntity(VlogDto vlogDto);
    VlogDto toDto(Vlog vlog);
}
