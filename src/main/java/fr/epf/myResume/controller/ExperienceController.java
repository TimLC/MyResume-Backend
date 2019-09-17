package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.ExperienceDAO;
import fr.epf.myResume.entities.Experience;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/experiences")
@Controller
public class ExperienceController {
    private final ExperienceDAO experienceDAO;

    public ExperienceController(ExperienceDAO experienceDAO) {
        this.experienceDAO = experienceDAO;
    }

    @GetMapping
    public List<Experience> getExperiences() {
        Iterable<Experience> it = this.experienceDAO.findAll();
        List<Experience> experiences = new ArrayList<>();
        it.forEach(e -> experiences.add(e));

        return experiences;
    }

    @GetMapping("/{id}")
    public Experience getExperience(@PathVariable Long id) {
        return this.experienceDAO.findById(id).get();
    }

    @DeleteMapping("delete/{id}")
    public void deleteExperience(@PathVariable Long id) {
        this.experienceDAO.deleteById(id);
    }

    @PostMapping("/add")
    public void addExperience(@RequestBody Experience experience) {
        this.experienceDAO.save(experience);
    }

    @PostMapping("/update")
    public void updateExperience(@RequestBody Experience experience) {
        this.experienceDAO.save(experience);
    }
}
