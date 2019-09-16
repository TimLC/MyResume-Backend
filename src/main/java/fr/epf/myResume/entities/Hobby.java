package fr.epf.myResume.entities;

public class Hobby {
    int id;
    String hobby_name;

    public Hobby(int id, String hobby_name) {
        this.id = id;
        this.hobby_name = hobby_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }
}
