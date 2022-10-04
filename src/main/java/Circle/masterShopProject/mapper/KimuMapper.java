package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.KimuDto;
import Circle.masterShopProject.entity.Kimu;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KimuMapper {
    Kimu toEntity(KimuDto kimuDto);

    KimuDto toDto(Kimu kimu);
}
