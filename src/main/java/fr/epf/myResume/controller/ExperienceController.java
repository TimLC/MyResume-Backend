package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.ExperienceDAO;
import fr.epf.myResume.entities.Experience;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/experiences")
@CrossOrigin
public class ExperienceController {
    private final ExperienceDAO experienceDAO;

    public ExperienceController(ExperienceDAO experienceDAO) {
        this.experienceDAO = experienceDAO;
    }

    @GetMapping
    public List<Experience> getExperiences() {
        Iterable<Experience> it = this.experienceDAO.findAll();
        List<Experience> experiences = new ArrayList<>();
        for (Experience e : it) {
            experiences.add(e);
        }

        return experiences;
    }

    @GetMapping("/{id}")
    public Experience getExperience(@PathVariable Long id) {
        if (this.experienceDAO.findById(id).isPresent()) {
            return this.experienceDAO.findById(id).get();
        }
        return null;
    }

    @DeleteMapping("delete/{id}")
    public void deleteExperience(@PathVariable Long id) {
        this.experienceDAO.deleteById(id);
    }

    @PostMapping("/add")
    public Experience addExperience(@RequestBody Experience experience) {
        this.experienceDAO.save(experience);
        return this.experienceDAO.findTopByOrOrderByIdDesc();
    }

    @PutMapping("/update")
    public void updateExperience(@RequestBody Experience experience) {
        this.experienceDAO.save(experience);
    }
}
