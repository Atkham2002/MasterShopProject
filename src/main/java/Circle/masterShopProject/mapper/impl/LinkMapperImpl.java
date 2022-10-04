package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.LinkDto;
import Circle.masterShopProject.entity.Link;

public class LinkMapperImpl {
    public static LinkDto toDto(Link link){
        return LinkDto.builder()
                .id(link.getId())
                .appName(link.getAppName())
                .url(link.getUrl())
                .build();
    }
}
