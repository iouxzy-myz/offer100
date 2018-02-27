package cn.hust.offer100.pojo;

import java.util.Date;

public class ResumeInterships {
    private Integer id;

    private Integer resumeId;

    private String intershipEnterprise;

    private String intershiPosition;

    private Date intershipStartdate;

    private Date intershipEnddate;

    private String intershipContent;

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
        this.intershipEnterprise = intershipEnterprise == null ? null : intershipEnterprise.trim();
    }

    public String getIntershiPosition() {
        return intershiPosition;
    }

    public void setIntershiPosition(String intershiPosition) {
        this.intershiPosition = intershiPosition == null ? null : intershiPosition.trim();
    }

    public Date getIntershipStartdate() {
        return intershipStartdate;
    }

    public void setIntershipStartdate(Date intershipStartdate) {
        this.intershipStartdate = intershipStartdate;
    }

    public Date getIntershipEnddate() {
        return intershipEnddate;
    }

    public void setIntershipEnddate(Date intershipEnddate) {
        this.intershipEnddate = intershipEnddate;
    }

    public String getIntershipContent() {
        return intershipContent;
    }

    public void setIntershipContent(String intershipContent) {
        this.intershipContent = intershipContent == null ? null : intershipContent.trim();
    }
}