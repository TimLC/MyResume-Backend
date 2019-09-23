package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.HobbyDAO;
import fr.epf.myResume.entities.Hobby;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/hobbies")
@RestController
@CrossOrigin
public class HobbyController {
    private final HobbyDAO hobbyDAO;

    public HobbyController(HobbyDAO hobbyDAO) {
        this.hobbyDAO = hobbyDAO;
    }

    @GetMapping
    public List<Hobby> getHobbies() {
        Iterable<Hobby> it = this.hobbyDAO.findAll();
        List<Hobby> hobbies = new ArrayList<>();
        for (Hobby e : it) {
            hobbies.add(e);
        }

        return hobbies;
    }

    @GetMapping("/{id}")
    public Hobby getHobby(@PathVariable Long id) {
        if (this.hobbyDAO.findById(id).isPresent()) {
            return this.hobbyDAO.findById(id).get();
        }
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHobby(@PathVariable Long id) {
        this.hobbyDAO.deleteById(id);
    }

    @PostMapping("/add")
    public Hobby addHobby(@RequestBody Hobby hobby) {
        this.hobbyDAO.save(hobby);
        return this.hobbyDAO.findTopByOrOrderByIdDesc();
    }

    @PutMapping("/update")
    public void updateHobby(@RequestBody Hobby hobby) {
        this.hobbyDAO.save(hobby);
    }
}
