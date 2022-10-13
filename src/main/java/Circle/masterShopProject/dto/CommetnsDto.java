package Circle.masterShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommetnsDto {
    private Long id;
    private String body;
    private Integer cilent_id;
    private Integer master_id;
    private double starts;
}
