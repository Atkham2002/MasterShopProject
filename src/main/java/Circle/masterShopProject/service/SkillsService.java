package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SkillsService {

    ResponseDto<String> addCSkills(SkillsDto skillsDto);

    ResponseDto<Page<SkillsDto>> getAllSkills(Integer page, Integer size);

    ResponseDto<SkillsDto> getByIdSkills(Integer id);

    ResponseDto updateSkills(SkillsDto skillsDto);

    ResponseDto deleteSkills(Integer id);

}
