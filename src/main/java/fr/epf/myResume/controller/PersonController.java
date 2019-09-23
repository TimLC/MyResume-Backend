package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.PersonDAO;
import fr.epf.myResume.entities.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
@CrossOrigin
@Api(description="API for operations on persons.")
public class PersonController {
    private final PersonDAO personDAO;

    public PersonController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @ApiOperation(value = "Return the person")
    @GetMapping
    public Person getPerson() {
        int id = 1; //just one person
        return personDAO.findById(Long.valueOf(id)).get();
    }

    @ApiOperation(value = "Update informations of the person")
    @PutMapping("/update")
    public void updatePerson(@RequestBody Person user) {
        this.personDAO.save(user);
    }
}
