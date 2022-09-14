package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.impl.DistrictServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/district")
@RequiredArgsConstructor
public class DistrictController {
    private final DistrictServiceImpl districtService;
    @GetMapping("/by_param")
    public ResponseDto<Page<DistrictDto>> byParams(@RequestParam MultiValueMap<String,String> params){
        return districtService.byParams(params);
    }
    @PostMapping
    public ResponseDto<String> addDistrict(@RequestBody DistrictDto districtDto){
        return districtService.addDistrict(districtDto);

    }
    @GetMapping("/{id}")
    public ResponseDto<DistrictDto> getById(@RequestParam Integer id){
        return districtService.getById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseDto deleteDistrictById(@PathVariable Integer id){
        return districtService.deleteDistrictById(id);
    }
    @PatchMapping
    public ResponseDto updateDistrict(@RequestBody DistrictDto districtDto){
        return districtService.updateDistrict(districtDto);
    }
}
