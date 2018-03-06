package cn.hust.offer100.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class ResumeIntroducation implements Serializable {
    /**
     * 本表id，自增
     */
    private Integer id;

    /**
     * 外键，关联用户基础简历表
     */
    private Integer resumeId;

    /**
     * 自我描述
     */
    private String introduceDetails;

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

    public String getIntroduceDetails() {
        return introduceDetails;
    }

    public void setIntroduceDetails(String introduceDetails) {
        this.introduceDetails = introduceDetails;
    }
}