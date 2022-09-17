package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.entity.Client;

public interface ClientMapper {
    Client toEntity(ClientDto clientDto);

    ClientDto toDto(Client client);
}
