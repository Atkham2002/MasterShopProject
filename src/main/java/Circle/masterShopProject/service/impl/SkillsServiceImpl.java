package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.service.SkillsService;
import org.springframework.data.domain.Page;

import java.util.List;

public class SkillsServiceImpl implements SkillsService {
    @Override
    public ResponseDto<String> addCSkills(SkillsDto skillsDto) {
        return null;
    }

    @Override
    public ResponseDto<List<Page<SkillsDto>>> getAllSkills() {
        return null;
    }

    @Override
    public ResponseDto<SkillsDto> getByIdSkills(Integer id) {
        return null;
    }

    @Override
    public ResponseDto updateSkills(SkillsDto skillsDto) {
        return null;
    }

    @Override
    public ResponseDto deleteSkills(Integer id) {
        return null;
    }
}
