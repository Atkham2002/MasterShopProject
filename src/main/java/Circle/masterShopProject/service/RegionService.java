package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.RegionDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public interface RegionService {
    ResponseDto<String> addRegion(RegionDto regionDto);
    ResponseDto<RegionDto> getById(Integer id);
    ResponseDto<Page<RegionDto>>byParams(MultiValueMap<String,String> params);
    ResponseDto updateRegion(RegionDto regionDto);
    ResponseDto deleteRegionById(Integer id);
}
