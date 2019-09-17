package fr.epf.myResume.entities;

public class Hobby {
    private Long id;
    private String hobby_name;

    public Hobby(Long id, String hobby_name) {
        this.id = id;
        this.hobby_name = hobby_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }
}
