package fr.epf.myResume.entities;

public class Project {
    int id;
    String project_name;
    String begin_date;
    String end_date;
    String description;
    String git_link;

    public Project(int id, String project_name, String begin_date, String end_date, String description, String git_link) {
        this.id = id;
        this.project_name = project_name;
        this.begin_date = begin_date;
        this.end_date = end_date;
        this.description = description;
        this.git_link = git_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGit_link() {
        return git_link;
    }

    public void setGit_link(String git_link) {
        this.git_link = git_link;
    }
}
