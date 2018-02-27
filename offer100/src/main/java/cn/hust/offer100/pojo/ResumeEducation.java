package cn.hust.offer100.pojo;

import java.util.Date;

public class ResumeEducation {
    private Integer id;

    private Integer resumeId;

    private String schoolName;

    private String schoolMajor;

    private String schoolBackground;

    private Date graduationYear;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getSchoolMajor() {
        return schoolMajor;
    }

    public void setSchoolMajor(String schoolMajor) {
        this.schoolMajor = schoolMajor == null ? null : schoolMajor.trim();
    }

    public String getSchoolBackground() {
        return schoolBackground;
    }

    public void setSchoolBackground(String schoolBackground) {
        this.schoolBackground = schoolBackground == null ? null : schoolBackground.trim();
    }

    public Date getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Date graduationYear) {
        this.graduationYear = graduationYear;
    }
}