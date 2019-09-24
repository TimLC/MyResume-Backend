package fr.epf.myResume.entities;

import javax.persistence.*;

@Entity(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "contactName")
    private String contactName;
    @Column(name = "contactEmail")
    private String contactEmail;
    @Column(name = "subject")
    private String subject;
    @Column(name = "message")
    private String message;

    public Message() {
    }

    public Message(String contactName, String contactEmail, String subject, String message) {
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.subject = subject;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
