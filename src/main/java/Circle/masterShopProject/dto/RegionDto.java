package Circle.masterShopProject.dto;

import Circle.masterShopProject.entity.District;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegionDto {
    private Integer id;
    private String name;
    private List<DistrictDto> districts;
}
