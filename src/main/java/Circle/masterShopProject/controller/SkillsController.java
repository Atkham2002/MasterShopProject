package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/skills")
@RequiredArgsConstructor
public class SkillsController {

    private final SkillsService skillsService;

    @GetMapping
    public ResponseDto<List<Page<SkillsDto>>> getAllSkills(){
        return skillsService.getAllSkills();
    }

    @GetMapping("/{id}")
    public ResponseDto<SkillsDto> getByIdSkills(@PathVariable Integer id){
        return skillsService.getByIdSkills(id);
    }

    @PostMapping
    public ResponseDto<String> addSkills(SkillsDto skillsDto){
        return skillsService.addCSkills(skillsDto);
    }

}
