package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.mapper.SkillsMapper;
import Circle.masterShopProject.mapper.impl.MapperSkills;
import Circle.masterShopProject.repository.SkillsRepository;
import Circle.masterShopProject.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SkillsServiceImpl implements SkillsService {

    private final SkillsRepository repository;
    private final SkillsMapper skillsMapper;

    @Override
    public ResponseDto<String> addCSkills(SkillsDto skillsDto) {
        repository.save(skillsMapper.toSkills(skillsDto));

        return ResponseDto.<String>builder().code(0).success(true).message("successfully saved").build();
    }

    @Override
    public ResponseDto<Page<SkillsDto>> getAllSkills(Integer page, Integer size) {
        PageRequest request = PageRequest.of(page,size);

        Page<SkillsDto> skillsDtos = repository.findAll(request).map(MapperSkills::toSkillsDto);

        return ResponseDto.<Page<SkillsDto>>builder().code(0).success(true).message("Ok").data(skillsDtos).build();
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
