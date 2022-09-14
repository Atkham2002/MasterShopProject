package Circle.masterShopProject.repository;

import Circle.masterShopProject.entity.MasterSkills;
import Circle.masterShopProject.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterSkillsRepository extends JpaRepository<MasterSkills, Integer> {

    boolean existsBySkillsOrClient(Skills skills, Object client);
}
