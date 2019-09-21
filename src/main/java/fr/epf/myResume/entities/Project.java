package fr.epf.myResume.entities;

public class Project {
    private Long id;
    private String projectName;
    private String beginDate;
    private String endDate;
    private String description;
    private String gitLink;

    public Project(Long id, String projectName, String beginDate, String endDate, String description, String gitLink) {
        this.id = id;
        this.projectName = projectName;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.description = description;
        this.gitLink = gitLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }
}
