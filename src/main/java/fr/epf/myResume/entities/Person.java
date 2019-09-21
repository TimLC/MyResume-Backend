package fr.epf.myResume.entities;

public class Person {
    private Long id;
    private String fullName;
    private String jobTitle;
    private String idGithub;
    private String phoneNumber;
    private String emailAddress;

    public Person(Long id, String fullName, String jobTitle, String idGithub, String phoneNumber, String emailAddress) {
        this.id = id;
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.idGithub = idGithub;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
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
