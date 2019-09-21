package fr.epf.myResume.entities;

public class Experience {
    private Long id;
    private String company;
    private String beginDate;
    private String endDate;
    private String address;
    private String description;

    public Experience(Long id, String company, String begin_date, String end_date, String address, String description) {
        this.id = id;
        this.company = company;
        this.beginDate = begin_date;
        this.endDate = end_date;
        this.address = address;
        this.description = description;
    }

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
