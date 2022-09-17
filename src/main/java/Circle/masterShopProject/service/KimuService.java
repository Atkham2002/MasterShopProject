package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.KimuDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public interface KimuService {
    ResponseDto<String> addKimu(KimuDto kimuDto);
    ResponseDto<KimuDto> getById(Integer id);
    ResponseDto<Page<KimuDto>>byParams(MultiValueMap<String,String> params);
    ResponseDto updateKimu(KimuDto kimuDto);
    ResponseDto deleteKimuById(Integer id);
}
