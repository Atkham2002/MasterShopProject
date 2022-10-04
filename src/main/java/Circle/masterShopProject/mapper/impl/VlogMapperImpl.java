package Circle.masterShopProject.mapper.impl;

import Circle.masterShopProject.dto.LinkDto;
import Circle.masterShopProject.dto.PhotoDto;
import Circle.masterShopProject.dto.VlogDto;
import Circle.masterShopProject.entity.Vlog;
import Circle.masterShopProject.mapper.CatalogMapper;

import java.util.List;

public class VlogMapperImpl {
    public static VlogDto toDto(Vlog vlog){
      List<PhotoDto>  photoDtos =  vlog.getPhotos().stream().map(PhotoMapperImpl::toDto).toList();
      List<LinkDto>  linkDtos = vlog.getLinks().stream().map(LinkMapperImpl::toDto).toList();
      return VlogDto.builder()
              .id(vlog.getId())
              .phoneDtos(photoDtos)
              .linkDtos(linkDtos)
//              .catalogDto()
              .build();

    }
}
