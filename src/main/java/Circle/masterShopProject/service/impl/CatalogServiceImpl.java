package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.CatalogService;
import org.springframework.data.domain.Page;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {
    @Override
    public ResponseDto<String> addCatalog(CatalogDto catalogDto) {
        return null;
    }

    @Override
    public ResponseDto<List<Page<CatalogDto>>> getAllCatalog() {
        return null;
    }

    @Override
    public ResponseDto<CatalogDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto updateCatalog(CatalogDto catalogDto) {
        return null;
    }

    @Override
    public ResponseDto deleteCatalog(Integer id) {
        return null;
    }
}
