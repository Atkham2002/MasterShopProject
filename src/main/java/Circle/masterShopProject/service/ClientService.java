package Circle.masterShopProject.service;

import Circle.masterShopProject.dto.ClientDto;

import Circle.masterShopProject.dto.MasterBookingDto;
import Circle.masterShopProject.dto.ResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;

public interface ClientService {
    ResponseDto<String> addClient(ClientDto clientDto);
    ResponseDto<ClientDto> getById(Integer id);
    ResponseDto<Page<ClientDto>>byParams(MultiValueMap<String,String> params);
    ResponseDto updateClient(ClientDto clientDto);
    ResponseDto deleteClientById(Integer id);

    ResponseDto booking(MasterBookingDto bookingDto);
}
