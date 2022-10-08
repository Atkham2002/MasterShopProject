package Circle.masterShopProject.repository;

import Circle.masterShopProject.entity.MasterSkills;
import Circle.masterShopProject.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MasterSkillsRepository extends JpaRepository<MasterSkills, Integer> {

    boolean existsBySkillsOrClient(Skills skills, Object client);

    @Query("select ms from MasterSkills ms where ms.skills.id = :skillId and ms.client.id = :clientId")
    Optional<MasterSkills> getService(@Param("skillId") Integer skillId, @Param("clientId") Integer clientId);
}
