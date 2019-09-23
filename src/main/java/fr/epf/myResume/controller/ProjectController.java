package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.ProjectDAO;
import fr.epf.myResume.entities.Project;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/projects")
@RestController
@CrossOrigin
@Api(description="API for operations on projects.")
public class ProjectController {
    private final ProjectDAO projectDAO;

    public ProjectController(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    @ApiOperation(value = "Return all projects.")
    @GetMapping
    public List<Project> getProjects() {
        Iterable<Project> it = this.projectDAO.findAll();
        List<Project> projects = new ArrayList<>();
        for (Project e : it) {
            projects.add(e);
        }

        return projects;
    }

    @ApiOperation(value = "Return a project from its id")
    @GetMapping("/{id}")
    public Project getProject(@PathVariable Long id) {
        if (this.projectDAO.findById(id).isPresent()) {
            return this.projectDAO.findById(id).get();
        }
        return null;
    }

    @ApiOperation(value = "Delete a project from its id")
    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id) {
        this.projectDAO.deleteById(id);
    }

    @ApiOperation(value = "Add a project and return it.")
    @PostMapping("/add")
    public Project addProject(@RequestBody Project project) {
        this.projectDAO.save(project);
        return this.projectDAO.findTopByOrderByIdDesc();
    }

    @ApiOperation(value = "Update a project from its object")
    @PutMapping("/update")
    public void updateProject(@RequestBody Project project) {
        this.projectDAO.save(project);
    }
}
