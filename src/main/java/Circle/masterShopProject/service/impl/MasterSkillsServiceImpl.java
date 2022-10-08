package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.entity.MasterSkills;
import Circle.masterShopProject.mapper.MasterSkillsMapper;
import Circle.masterShopProject.repository.MasterSkillsRepository;
import Circle.masterShopProject.service.MasterSkillsService;
import Circle.masterShopProject.service.helper.MasterSkillsHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.math.BigInteger;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MasterSkillsServiceImpl implements MasterSkillsService {

    private final MasterSkillsRepository repository;

    private final MasterSkillsMapper mapper;

    private final MasterSkillsHelper helper;

    @Override
    public ResponseDto<MasterSkillsDto> doPost(MasterSkillsDto masterSkillsDto) {
        MasterSkills entity = mapper.toEntity(masterSkillsDto);
        if(repository.existsBySkillsOrClient(entity.getSkills(), entity.getClient())){
            return ResponseDto.<MasterSkillsDto>builder()
                    .code(-1).success(false).message("The object is already exists!").data(null).build();
        }
        entity = repository.save(entity);

        return ResponseDto.<MasterSkillsDto>builder()
                .code(0).success(true).message("OK").data(mapper.toDto(entity)).build();
    }

    @Override
    public ResponseDto<Page<MasterSkillsDto>> getByParams(MultiValueMap<String, String> map) {

        if(!map.containsKey("page") || !map.containsKey("size")){
            return ResponseDto.<Page<MasterSkillsDto>>builder()
                    .code(-1).success(false).message("Page or size is not exists").build();
        }
        int page = Integer.parseInt(map.getFirst("page"));
        int size = Integer.parseInt(map.getFirst("size"));

        Pageable pageable = PageRequest.of(page, size);
        Page<MasterSkillsDto> p = helper.searchByParams(pageable, map);
        return ResponseDto.<Page<MasterSkillsDto>>builder()
                .code(0).success(true).message("OK").data(p).build();
    }

    public ResponseDto<MasterSkillsDto> getDtoById(Integer skillId, Integer clientId){
        if(skillId == null || clientId == null){
            return ResponseDto.<MasterSkillsDto>builder()
                    .code(-2).success(false).message("Skill's id or client's id is null").build();
        }

        Optional<MasterSkills> optional = repository.getService(skillId, clientId);
        if(optional.isEmpty()){
            return ResponseDto.<MasterSkillsDto>builder()
                    .code(-1).success(false).message("Master skills is not found!").build();
        }

        MasterSkills entity = optional.get();

        return ResponseDto.<MasterSkillsDto>builder()
                .code(0).success(true).message("OK").data(mapper.toDto(entity)).build();
    }
}
