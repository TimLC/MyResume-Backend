package fr.epf.myResume.controller;

import fr.epf.myResume.DAO.UserDAO;
import fr.epf.myResume.entities.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
@Api(description="API for operations on user.")
public class UserController {
    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @ApiOperation(value = "Return true if the credentials are correct, false else.")
    @PostMapping
    public Boolean connexion(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        return user.canLogin(sendUser.getPassword(), sendUser.getUsername());
    }

    @ApiOperation(value = "Update all informations from the user")
    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        int id = 1; //just one user
        user.setId(Long.valueOf(id));
        user.hashPassword();
        userDAO.save(user);
    }

    @ApiOperation(value = "Update only the username of the user")
    @PutMapping("/update/username")
    public void updateUserName(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        user.setUsername(sendUser.getUsername());
        userDAO.save(user);
    }

    @ApiOperation(value = "Update only the password of the user")
    @PutMapping("/update/password")
    public void updateUserPassword(@RequestBody User sendUser) {
        int id = 1; //just one user
        User user = userDAO.findById(Long.valueOf(id)).get();
        user.setNewPassword(sendUser.getPassword());
        this.userDAO.save(user);
    }
}
