package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "kimu")
public class Kimu {
    @Id
    @GeneratedValue(generator = "kimu_id")
    @SequenceGenerator(name = "kimu_id",sequenceName = "kimu_id_seq",allocationSize = 1)
    private Integer id;
    private String name;
}
