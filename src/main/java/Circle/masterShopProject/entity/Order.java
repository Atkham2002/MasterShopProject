package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "order")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    private List<Client> client;

    @ManyToMany
    private List<MasterSkills> masterSkills;

    private Date orderedTime;

    @Column(name = "created_at")
    private Date createdAt;

    private boolean status;
}
