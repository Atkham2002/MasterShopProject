package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.DistrictService;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public class DistrictServiceImpl implements DistrictService {
    @Override
    public ResponseDto<String> addDistrict(DistrictDto districtDto) {
        return null;
    }

    @Override
    public ResponseDto<DistrictDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<Page<DistrictDto>> byParams(MultiValueMap<String, String> params) {
        return null;
    }

    @Override
    public ResponseDto updateDistrict(DistrictDto districtDto) {
        return null;
    }

    @Override
    public ResponseDto deleteDistrictById(Integer id) {
        return null;
    }
}
