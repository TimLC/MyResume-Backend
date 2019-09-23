package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.SkillDAO;
import fr.epf.myResume.entities.Skill;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/skills")
@RestController
@CrossOrigin
@Api(description="API for operations on skills.")
public class SkillController {
    private final SkillDAO skillDAO;

    public SkillController(SkillDAO skillDAO) {
        this.skillDAO = skillDAO;
    }

    @ApiOperation(value = "Return all skills")
    @GetMapping
    public List<Skill> getSkills() {
        Iterable<Skill> it = this.skillDAO.findAll();
        List<Skill> skills = new ArrayList<>();
        for (Skill e : it) {
            skills.add(e);
        }

        return skills;
    }

    @ApiOperation(value = "Return a skill from its id")
    @GetMapping("/{id}")
    public Skill getSkill(@PathVariable Long id) {
        if (this.skillDAO.findById(id).isPresent()) {
            return this.skillDAO.findById(id).get();
        }
        return null;
    }

    @ApiOperation(value = "Delete a skill from its id")
    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable Long id) {
        this.skillDAO.deleteById(id);
    }

    @ApiOperation(value = "Add a skill and return it")
    @PostMapping("/add")
    public Skill addSkill(@RequestBody Skill skill) {
        this.skillDAO.save(skill);
        return this.skillDAO.findTopByOrderByIdDesc();
    }

    @ApiOperation(value = "Update a skill from its object")
    @PutMapping("/update")
    public void updateSkill(@RequestBody Skill skill) {
        this.skillDAO.save(skill);
    }
}
