package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.ProjectDAO;
import fr.epf.myResume.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/projects")
@Controller
public class ProjectController {
    private final ProjectDAO projectDAO;

    public ProjectController(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    @GetMapping
    public List<Project> getProjects() {
        Iterable<Project> it = this.projectDAO.findAll();
        List<Project> projects = new ArrayList<>();
        for (Project e : it) {
            projects.add(e);
        }

        return projects;
    }

    @GetMapping("/{id}")
    public Project getProject(@PathVariable Long id) {
        if (this.projectDAO.findById(id).isPresent()) {
            return this.projectDAO.findById(id).get();
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id) {
        this.projectDAO.deleteById(id);
    }

    @PostMapping("/add")
    public void addProject(@RequestBody Project project) {
        this.projectDAO.save(project);
    }

    @PostMapping("/update")
    public void updateProject(@RequestBody Project project) {
        this.projectDAO.save(project);
    }
}
