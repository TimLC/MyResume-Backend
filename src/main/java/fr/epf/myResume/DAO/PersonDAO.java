package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO  extends CrudRepository<Person, Long> {
}
