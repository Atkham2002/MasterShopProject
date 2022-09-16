package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.DistrictDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.entity.District;
import Circle.masterShopProject.mapper.DistrictMapper;
import Circle.masterShopProject.repository.DistrictRepository;
import Circle.masterShopProject.service.DistrictService;
import Circle.masterShopProject.service.helper.DistrictHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepository repository;
    private final DistrictMapper districtMapper;
    private final DistrictHelper districtHelper;
    @Override
    public ResponseDto<String> addDistrict(DistrictDto districtDto) {
        repository.save(districtMapper.toEntity(districtDto));
        return ResponseDto.<String>builder().code(200).success(true).message("successfully saved").build();
    }

    @Override
    public ResponseDto<DistrictDto> getById(Integer id) {
        Optional<District> optional = repository.findById(id);
        if(optional.isEmpty()){
            return ResponseDto.<DistrictDto>builder().code(404).success(false).message("Not found").build();

        }
        District district = optional.get();
        DistrictDto districtDto = districtMapper.toDto(district);
        return ResponseDto.<DistrictDto>builder().success(true).message("OK").data(districtDto).build();
    }
    @Override
    public ResponseDto<Page<DistrictDto>> byParams(MultiValueMap<String, String> params) {
        if(! params.containsKey("page")|| !params.containsKey("size")){
            return ResponseDto.<Page<DistrictDto>>builder().code(-2).message("Page adn Size is nall").success(false).data(null).build();
        }
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(params.getFirst("page")),Integer.parseInt(params.getFirst("page")));
        Page<DistrictDto> districtDtos = districtHelper.byParams(pageRequest,params);
        return ResponseDto.<Page<DistrictDto>>builder().data(districtDtos).success(true).message("ok").code(200).build();
    }

    @Override
    public ResponseDto updateDistrict(DistrictDto districtDto) {
        Optional<District> optional = repository.findById(districtDto.getId());
        if(optional.isEmpty()){
            return ResponseDto.builder().code(404).message("not Found District").success(false).build();

        }
        District district = optional.get();
        DistrictDto dto = DistrictDto.builder()
                .id(districtDto.getId() !=null? districtDto.getId(): district.getId())
                .name(districtDto.getName() !=null ? districtDto.getName():district.getName())
                //.regionId(districtDto.getRegionId() !=null ? districtDto.getRegionId():district.getRegionId())
                .build();

        return ResponseDto.builder().success(true).message("Ok").data(dto).code(200).build();
    }

    @Override
    public ResponseDto deleteDistrictById(Integer id) {
        if(repository.existsById(id)){
            District district = repository.findById(id).get();
            repository.delete(district);
         return    ResponseDto.builder().code(200).message("Ok").success(true).build();
        }
        return ResponseDto.builder().code(404).message("Not found").success(false).build();
    }
}
