package Circle.masterShopProject.mapper;

import Circle.masterShopProject.dto.ClientDto;
import Circle.masterShopProject.entity.Client;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client toEntity(ClientDto clientDto);
    ClientDto toDto(Client client);
}
