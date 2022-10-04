package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ResponseDto<String> addClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public ResponseDto<ClientDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<Page<ClientDto>> byParams(MultiValueMap<String, String> params) {
        return null;
    }

    @Override
    public ResponseDto updateClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public ResponseDto deleteClientById(Integer id) {
        return null;
    }
}
