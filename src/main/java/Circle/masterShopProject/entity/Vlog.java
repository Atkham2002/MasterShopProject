package Circle.masterShopProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vlog {
    @Id
    @GeneratedValue()
    private Integer id;

    @Column(name = "title", unique = true, length = 512)
    private String title;

    @Column(name = "body", length = 1024)
    private String body;

    @OneToMany
    private List<Photo> photos;

    @OneToMany
    private List<Link> links;

    @ManyToOne
    private Catalog catalog;
}
