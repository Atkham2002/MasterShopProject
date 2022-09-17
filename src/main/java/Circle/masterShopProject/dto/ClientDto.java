package Circle.masterShopProject.dto;

import Circle.masterShopProject.entity.Kimu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private Integer id;

    private String name;

    private String phoneNumber;

    private Integer locationId;

    private Kimu kimu;

}
