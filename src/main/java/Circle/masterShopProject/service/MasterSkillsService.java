package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public interface MasterSkillsService {

    ResponseDto<MasterSkillsDto> doPost(MasterSkillsDto masterSkillsDto);

    ResponseDto<Page<MasterSkillsDto>> getByParams(MultiValueMap<String, String> map);
}
