package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ResumeProject implements Serializable {
    /**
     * 本表id,自增
     */
    private Integer id;

    /**
     * 外键，关联用户基础简历表
     */
    private Integer resumeId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 你的职责
     */
    private String projectResponsibility;

    /**
     * 项目开始时间，年月
     */
    private String projectStarttime;

    /**
     * 项目结束时间，年月
     */
    private String projectEndtime;

    /**
     * 项目描述
     */
    private String projectDetails;

    private static final long serialVersionUID = 1L;

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
        this.projectName = projectName;
    }

    public String getProjectResponsibility() {
        return projectResponsibility;
    }

    public void setProjectResponsibility(String projectResponsibility) {
        this.projectResponsibility = projectResponsibility;
    }

    public String getProjectStarttime() {
        return projectStarttime;
    }

    public void setProjectStarttime(String projectStarttime) {
        this.projectStarttime = projectStarttime;
    }

    public String getProjectEndtime() {
        return projectEndtime;
    }

    public void setProjectEndtime(String projectEndtime) {
        this.projectEndtime = projectEndtime;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }
}