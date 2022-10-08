package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/skills")
@RequiredArgsConstructor
public class SkillsController {

    private final SkillsService skillsService;

    @GetMapping
    public ResponseDto<Page<SkillsDto>> getAllSkills(@RequestParam Integer page,@RequestParam Integer size){
        return skillsService.getAllSkills(page,size);
    }

    @GetMapping("/{id}")
    public ResponseDto<SkillsDto> getByIdSkills(@PathVariable Integer id){
        return skillsService.getByIdSkills(id);
    }

    @PostMapping
    public ResponseDto<SkillsDto> addSkills(@RequestBody SkillsDto skillsDto){
        return skillsService.addSkills(skillsDto);
    }

    @GetMapping("/byParamSkills")
    public ResponseDto<Page<SkillsDto>> byParam(@RequestParam MultiValueMap<String,String> params){
        return skillsService.byParamSkills(params);
    }

}
