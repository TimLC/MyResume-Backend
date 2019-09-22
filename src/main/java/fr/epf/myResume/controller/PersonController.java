package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.PersonDAO;
import fr.epf.myResume.entities.Person;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
@CrossOrigin
public class PersonController {
    private final PersonDAO personDAO;

    public PersonController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping
    public Person getPerson() {
        int id = 1; //just one person
        return personDAO.findById(Long.valueOf(id)).get();
    }

    @PutMapping("/update")
    public void updatePerson(@RequestBody Person user) {
        this.personDAO.save(user);
    }
}
