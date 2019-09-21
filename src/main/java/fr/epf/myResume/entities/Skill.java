package fr.epf.myResume.entities;

public class Skill {
    private Long id;
    private String skillName;

    public Skill(Long id, String skill_name) {
        this.id = id;
        this.skillName = skill_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skill_name) {
        this.skillName = skill_name;
    }
}
