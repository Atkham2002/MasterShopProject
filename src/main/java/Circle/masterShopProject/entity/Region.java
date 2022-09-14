package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @Id
    @GeneratedValue(generator = "reigon_id")
    @SequenceGenerator(name = "region_id",sequenceName = "region_id_seq",allocationSize = 1)
    private Integer id;
    private String name;
}
