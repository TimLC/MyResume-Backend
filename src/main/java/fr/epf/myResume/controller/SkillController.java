package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.SkillDAO;
import fr.epf.myResume.entities.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/skills")
@Controller
public class SkillController {
    private final SkillDAO skillDAO;

    public SkillController(SkillDAO skillDAO) {
        this.skillDAO = skillDAO;
    }

    @GetMapping
    public List<Skill> getSkills() {
        Iterable<Skill> it = this.skillDAO.findAll();
        List<Skill> skills = new ArrayList<>();
        it.forEach(e -> skills.add(e));

        return skills;
    }

    @GetMapping("/{id}")
    public Skill getSkill(@PathVariable Long id) {
        return this.skillDAO.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable Long id) {
        this.skillDAO.deleteById(id);
    }

    @PostMapping("/add")
    public void addSkill(@RequestBody Skill project) {
        this.skillDAO.save(project);
    }

    @PostMapping("/update")
    public void updateSkill(@RequestBody Skill project) {
        this.skillDAO.save(project);
    }
}
