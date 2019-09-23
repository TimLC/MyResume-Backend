package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.HobbyDAO;
import fr.epf.myResume.entities.Hobby;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/hobbies")
@RestController
@CrossOrigin
@Api(description="API for operations on hobbies.")
public class HobbyController {
    private final HobbyDAO hobbyDAO;

    public HobbyController(HobbyDAO hobbyDAO) {
        this.hobbyDAO = hobbyDAO;
    }

    @ApiOperation(value = "Return all hobbies")
    @GetMapping
    public List<Hobby> getHobbies() {
        Iterable<Hobby> it = this.hobbyDAO.findAll();
        List<Hobby> hobbies = new ArrayList<>();
        for (Hobby e : it) {
            hobbies.add(e);
        }

        return hobbies;
    }

    @ApiOperation(value = "Return an hobby from its id")
    @GetMapping("/{id}")
    public Hobby getHobby(@PathVariable Long id) {
        if (this.hobbyDAO.findById(id).isPresent()) {
            return this.hobbyDAO.findById(id).get();
        }
        return null;
    }

    @ApiOperation(value = "Delete a hobby from its id")
    @DeleteMapping("/delete/{id}")
    public void deleteHobby(@PathVariable Long id) {
        this.hobbyDAO.deleteById(id);
    }

    @ApiOperation(value = "Add a hobby and return it")
    @PostMapping("/add")
    public Hobby addHobby(@RequestBody Hobby hobby) {
        this.hobbyDAO.save(hobby);
        return this.hobbyDAO.findTopByOrderByIdDesc();
    }

    @ApiOperation(value = "Update a hobby from its object")
    @PutMapping("/update")
    public void updateHobby(@RequestBody Hobby hobby) {
        this.hobbyDAO.save(hobby);
    }
}
