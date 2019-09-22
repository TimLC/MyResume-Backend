package fr.epf.myResume.entities;

import javax.persistence.*;

@Entity(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "company")
    private String company;
    @Column(name = "beginDate")
    private String beginDate;
    @Column(name = "endDate")
    private String endDate;
    @Column(name = "address")
    private String address;
    @Column(name = "description")
    private String description;

    public Experience(Long id, String company, String begin_date, String end_date, String address, String description) {
        this.id = id;
        this.company = company;
        this.beginDate = begin_date;
        this.endDate = end_date;
        this.address = address;
        this.description = description;
    }

    public Experience() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String begin_date) {
        this.beginDate = begin_date;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
