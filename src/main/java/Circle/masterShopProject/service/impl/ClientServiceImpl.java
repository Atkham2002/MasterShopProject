package Circle.masterShopProject.service.impl;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.dto.MasterBookingDto;
import Circle.masterShopProject.dto.MasterSkillsDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.ClientService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final Environment environment;

    private MasterSkillsServiceImpl masterSkillsService;

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

    @Override
    public ResponseDto booking(MasterBookingDto bookingDto) {
        ResponseDto<MasterSkillsDto> response = masterSkillsService.getDtoById(bookingDto.getSkillsId(), bookingDto.getClientId());
        MasterSkillsDto masterSkillsDto = response.getData();




        return null;
    }
}
