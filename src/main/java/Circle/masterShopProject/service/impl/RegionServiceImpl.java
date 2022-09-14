package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.RegionDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.RegionService;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public class RegionServiceImpl implements RegionService {
    @Override
    public ResponseDto<String> addRegion(RegionDto regionDto) {
        return null;
    }

    @Override
    public ResponseDto<RegionDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<Page<RegionDto>> byParams(MultiValueMap<String, String> params) {
        return null;
    }

    @Override
    public ResponseDto updateRegion(RegionDto regionDto) {
        return null;
    }

    @Override
    public ResponseDto deleteRegionById(Integer id) {
        return null;
    }
}
