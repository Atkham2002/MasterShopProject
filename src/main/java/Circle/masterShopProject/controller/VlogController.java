package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.VlogDto;
import Circle.masterShopProject.service.impl.VlogServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vlog")
@RequiredArgsConstructor
public class VlogController {
    private VlogServiceImpl vlogService;
    @PatchMapping
    public ResponseDto addVlog(@RequestBody VlogDto vlogDto){
       return vlogService.addVlog(vlogDto);
    }
    @GetMapping("/{id}")
    public ResponseDto getById(@PathVariable Integer id){
        return vlogService.getById(id);
    }
    @GetMapping
    public ResponseDto getAll(@RequestParam Integer page,@RequestParam Integer size){
        return vlogService.getAllVlog(page,size);

    }
    @PutMapping
    public ResponseDto updateVlog(VlogDto vlogDto){
        return vlogService.updateVlog(vlogDto);
    }
    @DeleteMapping
    public ResponseDto deleteVlog(Integer id){
        return vlogService.deleteVlog(id);
    }
}
