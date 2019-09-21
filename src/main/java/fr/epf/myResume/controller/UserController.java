package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.UserDAO;
import fr.epf.myResume.entities.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@Controller
@CrossOrigin
public class UserController {
    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping
    public Boolean connexion(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        return user.canLogin(sendUser.getPassword(), sendUser.getUsername());
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        int id = 1; //just one user
        user.setId(Long.valueOf(id));
        user.hashPassword();
        userDAO.save(user);
    }

    @PutMapping("/update/username")
    public void updateUserName(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        user.setUsername(sendUser.getUsername());
        userDAO.save(user);
    }

    @PutMapping("/update/password")
    public void updateUserPassword(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        user.setNewPassword(sendUser.getPassword());
        this.userDAO.save(user);
    }
}
