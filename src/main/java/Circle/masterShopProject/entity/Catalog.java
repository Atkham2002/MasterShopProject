package Circle.masterShopProject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    @OneToMany(mappedBy = "catalogId",fetch = FetchType.LAZY)
    private List<Skills> skills;

}
