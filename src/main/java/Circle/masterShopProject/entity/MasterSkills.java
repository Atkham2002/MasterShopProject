package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "master_skills")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterSkills {

    @Id
    @GeneratedValue(generator = "master_skills_generator")
    @SequenceGenerator(name = "master_skills_generator", sequenceName = "master_skills_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "skills", referencedColumnName = "id")
    private Skills skills;

    @ManyToOne
    @JoinColumn(name = "client",referencedColumnName = "id")
    private Client client;

    private Double cost;

    private Integer experience;

}
