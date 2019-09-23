package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Hobby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyDAO extends CrudRepository<Hobby, Long> {
    public Hobby findTopByOrderByIdDesc();
}
