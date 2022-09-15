package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.CatalogDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping
    public ResponseDto<Page<CatalogDto>> getAllCatalog(@RequestParam Integer page,@RequestParam Integer size){
        return catalogService.getAllCatalog(page, size);
    }

    @GetMapping("/{id}")
    public ResponseDto<CatalogDto> getByIdCatalog(@PathVariable Integer id){
        return catalogService.getById(id);
    }


    @PostMapping
    public ResponseDto<String> addCatalog(CatalogDto catalogDto){
        return catalogService.addCatalog(catalogDto);
    }

}
