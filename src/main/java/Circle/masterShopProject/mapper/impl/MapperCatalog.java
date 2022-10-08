package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.Catalog;

import java.util.List;

public class MapperCatalog {

    public static CatalogDto ToCatalogDto(Catalog catalog){
        List<SkillsDto> list = catalog.getSkills().stream().map(MapperSkills::NoCatalogId).toList();
        return CatalogDto.builder()
                .id(catalog.getId())
                .name(catalog.getName())
                .skills(list)
                .build();
    }


    public static CatalogDto NoSkills(Catalog catalog){
        return CatalogDto.builder()
                .id(catalog.getId())
                .name(catalog.getName())
                .build();
    }

}
