package fr.epf.myResume.entities;

public class User {
    private Long id;
    private String username;
    private String full_name;
    private String job_title;
    private String id_github;
    private String password;

    public User(Long id, String username, String full_name, String job_title, String id_github, String password) {
        this.id = id;
        this.username = username;
        this.full_name = full_name;
        this.job_title = job_title;
        this.id_github = id_github;
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

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getId_github() {
        return id_github;
    }

    public void setId_github(String id_github) {
        this.id_github = id_github;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
