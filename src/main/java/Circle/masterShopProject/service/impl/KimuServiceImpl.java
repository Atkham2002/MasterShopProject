package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.KimuDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.KimuService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class KimuServiceImpl implements KimuService {
    @Override
    public ResponseDto<String> addKimu(KimuDto kimuDto) {
        return null;
    }

    @Override
    public ResponseDto<KimuDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<Page<KimuDto>> byParams(MultiValueMap<String, String> params) {
        return null;
    }

    @Override
    public ResponseDto updateKimu(KimuDto kimuDto) {
        return null;
    }

    @Override
    public ResponseDto deleteKimuById(Integer id) {
        return null;
    }
}
