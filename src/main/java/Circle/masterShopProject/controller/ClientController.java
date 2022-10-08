package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.dto.MasterBookingDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.ClientService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    private final Environment environment;

    @GetMapping("/by_param")
    public ResponseDto<Page<ClientDto>> byParams(@RequestParam MultiValueMap<String,String> params){
        return clientService.byParams(params);
    }
    @PostMapping
    public ResponseDto<String> addClient(@RequestBody ClientDto clientDto){
        return clientService.addClient(clientDto);

    }
    @GetMapping("/{id}")
    public ResponseDto<ClientDto> getById(@RequestParam Integer id){
        return clientService.getById(id);
    }
    @DeleteMapping("/{id}")
    public ResponseDto deleteClientById(@PathVariable Integer id){
        return clientService.deleteClientById(id);
    }
    @PatchMapping
    public ResponseDto updateClient(@RequestBody ClientDto clientDto){
        return clientService.updateClient(clientDto);
    }

    @PostMapping("/booking")
    public ResponseDto<ClientDto> booking(@RequestBody MasterBookingDto bookingDto){


        return null;
    }

    @GetMapping("/sms-message")
    public void sendSMS(@RequestParam String phone_number, @RequestParam String message){
        Twilio.init(environment.getProperty("twilio.account.sid"), environment.getProperty("twilio.auth.token"));
        Message m = Message.creator(
                        new PhoneNumber(phone_number),
                        new PhoneNumber("+998999124625"),
                        message)
                .create();
    }
}
