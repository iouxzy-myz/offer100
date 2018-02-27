package cn.hust.offer100.pojo;

import java.util.Date;

public class ResumeProject {
    private Integer id;

    private Integer resumeId;

    private String projectName;

    private String projectResponsibility;

    private Date projectStarttime;

    private Date projectEndtime;

    private String projectDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectResponsibility() {
        return projectResponsibility;
    }

    public void setProjectResponsibility(String projectResponsibility) {
        this.projectResponsibility = projectResponsibility == null ? null : projectResponsibility.trim();
    }

    public Date getProjectStarttime() {
        return projectStarttime;
    }

    public void setProjectStarttime(Date projectStarttime) {
        this.projectStarttime = projectStarttime;
    }

    public Date getProjectEndtime() {
        return projectEndtime;
    }

    public void setProjectEndtime(Date projectEndtime) {
        this.projectEndtime = projectEndtime;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails == null ? null : projectDetails.trim();
    }
}