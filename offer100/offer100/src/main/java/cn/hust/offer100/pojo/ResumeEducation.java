package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ResumeEducation implements Serializable {
    /**
     * 本表id，自增
     */
    private Integer id;

    /**
     * 外键，关联用户基础简历表
     */
    private Integer resumeId;

    /**
     * 学校名
     */
    private String schoolName;

    /**
     * 所学专业
     */
    private String schoolMajor;

    /**
     * 同最高学历，专本硕博等
     */
    private String schoolBackground;

    /**
     * 毕业年份,只有年
     */
    private String graduationYear;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolMajor() {
        return schoolMajor;
    }

    public void setSchoolMajor(String schoolMajor) {
        this.schoolMajor = schoolMajor;
    }

    public String getSchoolBackground() {
        return schoolBackground;
    }

    public void setSchoolBackground(String schoolBackground) {
        this.schoolBackground = schoolBackground;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }
}