package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.RegionDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.impl.DistrictServiceImpl;
import Circle.masterShopProject.service.impl.RegionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/region")
@RequiredArgsConstructor
public class RegionController {
    private final RegionServiceImpl regionService;
    @GetMapping("/by_param")
    public ResponseDto<Page<RegionDto>> byParams(@RequestParam MultiValueMap<String,String> params){
        return regionService.byParams(params);
    }
    @PostMapping
    public ResponseDto<String> addRegion(@RequestBody RegionDto regionDto){
        return regionService.addRegion(regionDto);

    }
    @GetMapping("/{id}")
    public ResponseDto<RegionDto> getById(@RequestParam Integer id){
        return regionService.getById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseDto deleteRegionById(@PathVariable Integer id){
        return regionService.deleteRegionById(id);
    }
    @PatchMapping
    public ResponseDto updateRegion(@RequestBody RegionDto regionDto){
        return regionService.updateRegion(regionDto);
    }
}
