package fr.epf.myResume.entities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class User {
    private Long id;
    private String username;
    private String password;

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void hashPassword() {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder(12);
        this.password = b.encode(this.password);
    }

    public void setNewPassword(String password) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder(12);
        password = b.encode(password);
        this.password = password;
    }

    public Boolean canLogin(String rawPassword, String username) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder(12);
        return b.matches(rawPassword, this.password) && username.equals(this.username);
    }
}
