package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.KimuDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.KimuService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kimu")
@RequiredArgsConstructor
public class KimuController {
    private final KimuService kimuService;
    @GetMapping("/by_param")
    public ResponseDto<Page<KimuDto>> byParams(@RequestParam MultiValueMap<String,String> params){
        return kimuService.byParams(params);
    }
    @PostMapping
    public ResponseDto<String> addKimu(@RequestBody KimuDto kimuDto){
        return kimuService.addKimu(kimuDto);

    }
    @GetMapping("/{id}")
    public ResponseDto<KimuDto> getById(@RequestParam Integer id){
        return kimuService.getById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseDto deleteKimuById(@PathVariable Integer id){
        return kimuService.deleteKimuById(id);
    }
    @PatchMapping
    public ResponseDto updateKimu(@RequestBody KimuDto kimuDto){
        return kimuService.updateKimu(kimuDto);
    }
}
