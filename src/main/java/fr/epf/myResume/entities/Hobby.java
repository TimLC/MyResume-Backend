package fr.epf.myResume.entities;

public class Hobby {
    private Long id;
    private String hobbyName;

    public Hobby(Long id, String hobby_name) {
        this.id = id;
        this.hobbyName = hobby_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobby_name) {
        this.hobbyName = hobby_name;
    }
}
