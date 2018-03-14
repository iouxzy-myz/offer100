/**
 * 
 */
package cn.hust.offer100.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Super-mao
 *
 */
public class InterviewAccept implements Serializable{
    private Integer postId;

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

    private static final long serialVersionUID = 3L;

	/**
	 * @return the postId
	 */
	public Integer getPostId() {
		return postId;
	}

	/**
	 * @param postId the postId to set
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	/**
	 * @return the resumeId
	 */
	public Integer getResumeId() {
		return resumeId;
	}

	/**
	 * @param resumeId the resumeId to set
	 */
	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the positionId
	 */
	public Integer getPositionId() {
		return positionId;
	}

	/**
	 * @param positionId the positionId to set
	 */
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	/**
	 * @return the interviewTime
	 */
	public Date getInterviewTime() {
		return interviewTime;
	}

	/**
	 * @param interviewTime the interviewTime to set
	 */
	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}

	/**
	 * @return the interviewAddress
	 */
	public String getInterviewAddress() {
		return interviewAddress;
	}

	/**
	 * @param interviewAddress the interviewAddress to set
	 */
	public void setInterviewAddress(String interviewAddress) {
		this.interviewAddress = interviewAddress;
	}

	/**
	 * @return the contactUser
	 */
	public String getContactUser() {
		return contactUser;
	}

	/**
	 * @param contactUser the contactUser to set
	 */
	public void setContactUser(String contactUser) {
		this.contactUser = contactUser;
	}

	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * @param contactPhone the contactPhone to set
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the delayTime
	 */
	public Date getDelayTime() {
		return delayTime;
	}

	/**
	 * @param delayTime the delayTime to set
	 */
	public void setDelayTime(Date delayTime) {
		this.delayTime = delayTime;
	}
}
