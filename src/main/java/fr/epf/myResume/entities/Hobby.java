package fr.epf.myResume.entities;

import javax.persistence.*;

@Entity(name = "hobbies")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "hobbyName")
    private String hobbyName;

    public Hobby(Long id, String hobby_name) {
        this.id = id;
        this.hobbyName = hobby_name;
    }

    public Hobby() {
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
