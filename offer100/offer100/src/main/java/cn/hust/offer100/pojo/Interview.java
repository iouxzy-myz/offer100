package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Interview implements Serializable {
    private Integer id;

    /**
     * 外键，简历表id，关联简历基础表
     */
    private Integer resumeId;

    /**
     * 外键，企业用户ID，用户表
     */
    private Integer userId;

    /**
     * 外键，职位ID，关联职位表
     */
    private Integer positionId;

    /**
     * 面试安排时间
     */
    private Date interviewTime;

    /**
     * 面试地点
     */
    private String interviewAddress;

    /**
     * 面试联系人名
     */
    private String contactUser;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 面试状态，默认待确认 0 待面试，1、放弃面试 2.申请延期 3.已面试 4、未参加。待面试和申请延期根据面试和系统时间比较自动更新为已面试
     */
    private String status;

    /**
     * 延期面试时间，只在用户推迟面试才需要，平时为空，后添加
     */
    private Date delayTime;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInterviewAddress() {
        return interviewAddress;
    }

    public void setInterviewAddress(String interviewAddress) {
        this.interviewAddress = interviewAddress;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }
}