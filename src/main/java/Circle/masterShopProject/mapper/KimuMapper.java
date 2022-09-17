package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.KimuDto;
import Circle.masterShopProject.entity.Kimu;

public interface KimuMapper {
    Kimu toEntity(KimuDto kimuDto);

    KimuDto toDto(Kimu kimu);
}
