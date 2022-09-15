package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.entity.Catalog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CatalogMapper {

    Catalog toCatalog(CatalogDto catalogDto);

    CatalogDto toCatalogDto(Catalog catalog);

}
