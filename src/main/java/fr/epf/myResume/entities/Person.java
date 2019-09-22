package fr.epf.myResume.entities;

import javax.persistence.*;

@Entity(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "jobTitle")
    private String jobTitle;
    @Column(name = "idGithub")
    private String idGithub;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "emailAddress")
    private String emailAddress;

    public Person(Long id, String fullName, String jobTitle, String idGithub, String phoneNumber, String emailAddress) {
        this.id = id;
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.idGithub = idGithub;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getIdGithub() {
        return idGithub;
    }

    public void setIdGithub(String idGithub) {
        this.idGithub = idGithub;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
