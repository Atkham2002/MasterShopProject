package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(generator = "district_id")
    @SequenceGenerator(name = "district_id",sequenceName = "district_id_seq",allocationSize = 1)
    private Integer id;
    private String name;
    @ManyToOne()
    private Region regionId;


}
