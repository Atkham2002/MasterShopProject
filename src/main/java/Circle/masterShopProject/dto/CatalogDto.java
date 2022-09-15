package Circle.masterShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDto {

    private Integer id;

    private String name;

    private List<SkillsDto> skills;

}
