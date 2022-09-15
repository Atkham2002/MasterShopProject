package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CatalogService {

    ResponseDto<String> addCatalog(CatalogDto catalogDto);

    ResponseDto<Page<CatalogDto>> getAllCatalog(Integer page,Integer size);

    ResponseDto<CatalogDto> getById(Integer id);

    ResponseDto updateCatalog(CatalogDto catalogDto);

    ResponseDto deleteCatalog(Integer id);

}
