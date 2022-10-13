package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(generator = "client_generator")
    @SequenceGenerator(name = "client_generator", sequenceName = "client_id_seq", allocationSize = 1)
    private Integer id;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "location_id")
    private Integer locationId;
    @ManyToOne
    @JoinColumn(name = "kimu", referencedColumnName = "id")
    private Kimu kimu;

    @OneToMany
    private List<PhotoUsta> photos;
}
