package Circle.masterShopProject.dto;

import Circle.masterShopProject.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OrderDto {
        private List<Client> client;
        private Integer masterId;
        private Date orderdTime;
        private boolean status;

}
