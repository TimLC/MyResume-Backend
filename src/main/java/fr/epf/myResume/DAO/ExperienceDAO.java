package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Experience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceDAO extends CrudRepository<Experience, Long> {
    public Experience findTopByOrderByIdDesc();
}
