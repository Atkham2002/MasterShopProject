package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.LinkDto;
import Circle.masterShopProject.entity.Link;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LinkMapper {
    Link toEntity(LinkDto linkDto);
    LinkDto toDto(Link link);
}
