package Circle.masterShopProject.repository;

import Circle.masterShopProject.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Integer> {
}
