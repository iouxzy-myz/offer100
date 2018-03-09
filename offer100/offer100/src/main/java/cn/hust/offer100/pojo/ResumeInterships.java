package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ResumeInterships implements Serializable {
    /**
     * 本表id，主键，自增长
     */
    private Integer id;

    /**
     * 外键，关联用户基础简历表id
     */
    private Integer resumeId;

    /**
     * 实习企业
     */
    private String intershipEnterprise;

    /**
     * 实习职位
     */
    private String intershipPosition;

    /**
     * 实习开始时间，年月
     */
    private String intershipStartdate;

    /**
     * 实习结束时间，年月
     */
    private String intershipEnddate;

    /**
     * 实习内容，可为空
     */
    private String intershipContent;

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

    public String getIntershipEnterprise() {
        return intershipEnterprise;
    }

    public void setIntershipEnterprise(String intershipEnterprise) {
        this.intershipEnterprise = intershipEnterprise;
    }

    public String getIntershiPosition() {
        return intershipPosition;
    }

    public void setIntershiPosition(String intershipPosition) {
        this.intershipPosition = intershipPosition;
    }

    public String getIntershipStartdate() {
        return intershipStartdate;
    }

    public void setIntershipStartdate(String intershipStartdate) {
        this.intershipStartdate = intershipStartdate;
    }

    public String getIntershipEnddate() {
        return intershipEnddate;
    }

    public void setIntershipEnddate(String intershipEnddate) {
        this.intershipEnddate = intershipEnddate;
    }

    public String getIntershipContent() {
        return intershipContent;
    }

    public void setIntershipContent(String intershipContent) {
        this.intershipContent = intershipContent;
    }
}