package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;

public interface SkillsService {

    ResponseDto<String> addSkills(SkillsDto skillsDto);


    ResponseDto<Page<SkillsDto>> getAllSkills(Integer page, Integer size);

    ResponseDto<SkillsDto> getByIdSkills(Integer id);


    ResponseDto deleteSkills(Integer id);

    ResponseDto<Page<SkillsDto>> byParamSkills(MultiValueMap<String,String> params);

}
