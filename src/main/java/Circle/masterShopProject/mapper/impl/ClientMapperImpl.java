package Circle.masterShopProject.mapper.impl;
import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.entity.Client;


public class ClientMapperImpl {
    public static ClientDto toClientDto(Client client){
        return ClientDto.builder()
                .id(client.getId())
                .name(client.getName())
                .phoneNumber(client.getPhoneNumber())
                .locationId(client.getLocationId())
                .kimu(client.getKimu())
                .build();

    }
    public static ClientDto toClientDtoNo(Client client) {
        return ClientDto.builder()
                .id(client.getId())
                .name(client.getName())
                .phoneNumber(client.getPhoneNumber())
                .locationId(client.getLocationId())
                .kimu(client.getKimu())
                .build();
    }
}
