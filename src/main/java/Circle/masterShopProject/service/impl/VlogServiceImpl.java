package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.VlogDto;
import Circle.masterShopProject.entity.Vlog;
import Circle.masterShopProject.mapper.VlogMapper;
import Circle.masterShopProject.mapper.impl.VlogMapperImpl;
import Circle.masterShopProject.repository.VlogRepository;
import Circle.masterShopProject.service.VlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VlogServiceImpl implements VlogService {
    @Autowired
    private VlogRepository vlogRepository;
    private VlogMapper vlogMapper;
    @Override
    public ResponseDto addVlog(VlogDto vlogDto) {
        vlogRepository.save(vlogMapper.toEntity(vlogDto));
        return ResponseDto.builder().success(true).code(200).message("Ok").data(vlogDto).build();
    }

    @Override
    public ResponseDto<Page<VlogDto>> getAllVlog(Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<VlogDto> vlogDto =  vlogRepository.findAll(pageRequest).map(VlogMapperImpl::toDto);
        return ResponseDto.<Page<VlogDto>>builder().data(vlogDto).message("Ok").code(200).success(true).build();
    }

    @Override
    public ResponseDto getById(Integer id) {
        Optional<Vlog> optional = vlogRepository.findById(id);
        if(optional.isPresent()){
            return ResponseDto.<String>builder().message("Buday id qiymat yoq").success(false).code(404).build();
        }
       Vlog vlog = optional.get();
       VlogDto vlogDto = VlogMapperImpl.toDto(vlog);
        return ResponseDto.<VlogDto> builder().success(true).code(200).message("Ok").data(vlogDto).build();
    }

    @Override
    public ResponseDto updateVlog(VlogDto vlogDto) {
        return null;
    }

    @Override
    public ResponseDto deleteVlog(Integer id) {
        Optional<Vlog> optional = vlogRepository.findById(id);
        if (optional.isPresent()){
            return ResponseDto.<String>builder().message("Buday id qiymat yoq").success(false).code(404).build();
        }
        vlogRepository.deleteById(id);
        return ResponseDto.builder().code(200).success(true).message("Ok").build();
    }
}
