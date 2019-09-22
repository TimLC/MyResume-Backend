package fr.epf.myResume.entities;

import javax.persistence.*;

@Entity(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "skillName")
    private String skillName;

    public Skill(Long id, String skill_name) {
        this.id = id;
        this.skillName = skill_name;
    }

    public Skill() {
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
