package Circle.masterShopProject.service.impl;
import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.mapper.CatalogMapper;
import Circle.masterShopProject.mapper.impl.MapperCatalog;
import Circle.masterShopProject.repository.CatalogRepository;
import Circle.masterShopProject.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;
    private final CatalogMapper catalogMapper;

    @Override
    public ResponseDto<String> addCatalog(CatalogDto catalogDto) {
        catalogRepository.save(catalogMapper.toCatalog(catalogDto));

        return ResponseDto.<String>builder().code(0).success(true).message("successfully saved").build();
    }

    @Override
    public ResponseDto<Page<CatalogDto>> getAllCatalog(Integer page,Integer size) {

        PageRequest p = PageRequest.of(page,size);

        Page<CatalogDto> catalogDtos = catalogRepository.findAll(p).map(MapperCatalog::ToCatalogDto);

        return ResponseDto.<Page<CatalogDto>>builder().code(0).message("Successfully").success(true).data(catalogDtos).build();

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
