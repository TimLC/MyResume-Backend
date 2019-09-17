package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.UserDAO;
import fr.epf.myResume.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping
    public User getUser() {
        int id = 1;
        return userDAO.findById(Long.valueOf(id)).get();
    }
}
