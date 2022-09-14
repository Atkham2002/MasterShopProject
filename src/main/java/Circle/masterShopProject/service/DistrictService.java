package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public interface DistrictService {
    ResponseDto<String> addDistrict(DistrictDto districtDto);
    ResponseDto<DistrictDto> getById(Integer id);
    ResponseDto<Page<DistrictDto>>byParams(MultiValueMap<String,String> params);
    ResponseDto updateDistrict(DistrictDto districtDto);
    ResponseDto deleteDistrictById(Integer id);

}
