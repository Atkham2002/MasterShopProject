package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillsService {

    ResponseDto<String> addCSkills(SkillsDto skillsDto);

    ResponseDto<List<Page<SkillsDto>>> getAllSkills();

    ResponseDto<SkillsDto> getByIdSkills(Integer id);

    ResponseDto updateSkills(SkillsDto skillsDto);

    ResponseDto deleteSkills(Integer id);

}
