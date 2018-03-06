package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PostBox implements Serializable {
    /**
     * 本表ID，自增
     */
    private Integer id;

    /**
     * 外键，简历表ID，关联简历表
     */
    private Integer resumeId;

    /**
     * 职位ID，外键，关联职位表
     */
    private Integer positionId;

    /**
     * 简历投递时间，详细时间格式
     */
    private Date postTime;

    /**
     * 简历状态，默认，投递成功【0 投递成功，1 通知面试，2 不合适 3 录用 -1、逻辑删除】
     */
    private String status;

    /**
     * 不合适原因，默认为空
     */
    private String reason;

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

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}