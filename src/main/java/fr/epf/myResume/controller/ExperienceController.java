package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.ExperienceDAO;
import fr.epf.myResume.entities.Experience;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/experiences")
@CrossOrigin(origins = "http://localhost:4200")
@Api(description="API for operations on experiences.")
public class ExperienceController {
    private final ExperienceDAO experienceDAO;

    public ExperienceController(ExperienceDAO experienceDAO) {
        this.experienceDAO = experienceDAO;
    }

    @ApiOperation(value = "Return all experiences")
    @GetMapping
    public List<Experience> getExperiences() {
        Iterable<Experience> it = this.experienceDAO.findAll();
        List<Experience> experiences = new ArrayList<>();
        for (Experience e : it) {
            experiences.add(e);
        }

        return experiences;
    }

    @ApiOperation(value = "Return an experience from its id")
    @GetMapping("/{id}")
    public Experience getExperience(@PathVariable Long id) {
        if (this.experienceDAO.findById(id).isPresent()) {
            return this.experienceDAO.findById(id).get();
        }
        return null;
    }

    @ApiOperation(value = "Delete an experience from its id")
    @DeleteMapping("delete/{id}")
    public void deleteExperience(@PathVariable Long id) {
        this.experienceDAO.deleteById(id);
    }

    @ApiOperation(value = "Add an experience and return it")
    @PostMapping("/add")
    public Experience addExperience(@RequestBody Experience experience) {
        return this.experienceDAO.save(experience);
    }

    @ApiOperation(value = "Update an experience from its object")
    @PutMapping("/update")
    public void updateExperience(@RequestBody Experience experience) {
        this.experienceDAO.save(experience);
    }
}
