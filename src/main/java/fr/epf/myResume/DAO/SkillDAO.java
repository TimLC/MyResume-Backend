package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillDAO extends CrudRepository<Skill, Long> {
    public Skill findTopByOrderByIdDesc();
}
