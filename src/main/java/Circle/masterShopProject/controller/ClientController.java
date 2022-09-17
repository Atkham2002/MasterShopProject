package Circle.masterShopProject.controller;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.dto.ResponseDto;
import Circle.masterShopProject.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

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
    public ResponseDto updateClent(@RequestBody ClientDto clientDto){
        return clientService.updateClient(clientDto);
    }
}
