package Circle.masterShopProject.service;


import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.dto.VlogDto;
import org.springframework.data.domain.Page;

public interface VlogService {
    ResponseDto addVlog(VlogDto vlogDto);
    ResponseDto<Page<VlogDto>> getAllVlog(Integer page, Integer size);
    ResponseDto<String> getById(Integer id);
    ResponseDto updateVlog(VlogDto vlogDto);
    ResponseDto deleteVlog(Integer id);
}
