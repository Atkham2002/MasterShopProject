package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.PhotoDto;
import Circle.masterShopProject.entity.Photo;

public class PhotoMapperImpl {
    public static Photo ToEntity(PhotoDto photoDto){
        return Photo.builder()
                .id(photoDto.getId())
                .name(photoDto.getName())
                .absolutePath(photoDto.getAbsolutePath())
                .build();
    }
    public static PhotoDto toDto(Photo photo){
        return PhotoDto.builder()
                .id(photo.getId())
                .name(photo.getName())
                .absolutePath(photo.getAbsolutePath())
                .build();
    }
}
