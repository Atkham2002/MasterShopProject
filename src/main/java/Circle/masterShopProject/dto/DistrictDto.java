package Circle.masterShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDto {
    private Integer id;
    private String name;
    private RegionDto regionId;
}
