package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "regionId",fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private List<District> districts;
}
