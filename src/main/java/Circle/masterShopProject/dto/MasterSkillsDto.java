package Circle.masterShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterSkillsDto {

    private Integer id;

    private SkillsDto skills;

    private ClientDto client;

    private Double cost;

    private Integer experience;
}
