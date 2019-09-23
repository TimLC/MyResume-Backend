package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDAO extends CrudRepository<Project, Long> {
    public Project findTopByOrOrderByIdDesc();
}
