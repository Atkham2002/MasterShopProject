package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.SkillsDto;
import Circle.masterShopProject.entity.Skills;
import Circle.masterShopProject.mapper.SkillsMapper;
import Circle.masterShopProject.mapper.impl.MapperSkills;
import Circle.masterShopProject.repository.SkillsRepository;
import Circle.masterShopProject.service.SkillsService;
import Circle.masterShopProject.service.helper.SkillsHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SkillsServiceImpl implements SkillsService {

    private final SkillsRepository repository;
    private final SkillsMapper skillsMapper;
    private final SkillsHelper helper;

    @Override
    public ResponseDto<SkillsDto> addSkills(SkillsDto skillsDto) {
        Skills skills = repository.save(skillsMapper.toSkills(skillsDto));

        SkillsDto dto = skillsMapper.toSkillsDto(skills);

        return ResponseDto.<SkillsDto>builder().code(0).success(true).message("successfully saved").data(dto).build();
    }

    @Override
    public ResponseDto<Page<SkillsDto>> getAllSkills(Integer page, Integer size) {
        PageRequest request = PageRequest.of(page,size);

//        System.out.println(repository.findAll());

        Page<SkillsDto> skillsDtos = repository.findAll(request).map(MapperSkills::toSkillsDto);

        return ResponseDto.<Page<SkillsDto>>builder().code(0).success(true).message("Ok").data(skillsDtos).build();
    }

    @Override
    public ResponseDto<SkillsDto> getByIdSkills(Integer id) {
        try {

            Optional<Skills> optional = repository.findById(id);
            Skills skills = optional.get();
            SkillsDto skillsDto = MapperSkills.toSkillsDto(skills);

            return ResponseDto.<SkillsDto>builder().code(0).success(true).message("Ok").data(skillsDto).build();

        }catch (Exception e){
            return ResponseDto.<SkillsDto>builder().success(false).message(e.getMessage()).code(404).data(null).build();
        }

    }


    @Override
    public ResponseDto deleteSkills(Integer id) {

        Optional<Skills> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.delete(optional.get());
            return ResponseDto.builder().message("Deleted").code(0).success(true).build();
        }

        return ResponseDto.builder().success(false).message("Not founded").build();

    }

    @Override
    public ResponseDto<Page<SkillsDto>> byParamSkills(MultiValueMap<String, String> map) {

        if(!map.containsKey("page") || !map.containsKey("size")){
            return ResponseDto.<Page<SkillsDto>>builder()
                    .code(-1).success(false).message("Page or size is not exists").build();
        }

        int page = Integer.parseInt(map.getFirst("page"));
        int size = Integer.parseInt(map.getFirst("size"));

        Pageable pageable = PageRequest.of(page,size);
        Page<SkillsDto> list = helper.searchByParams(pageable,map);

        return ResponseDto.<Page<SkillsDto>>builder().data(list).message("ok").success(true).code(0).build();

    }
}
