package fr.epf.myResume.DAO;

import fr.epf.myResume.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDAO extends CrudRepository<Message, Long> {
}
