package fr.epf.myResume.entities;

public class Skill {
    int id;
    String skill_name;

    public Skill(int id, String skill_name) {
        this.id = id;
        this.skill_name = skill_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }
}
