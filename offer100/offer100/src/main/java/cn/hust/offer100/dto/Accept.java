package cn.hust.offer100.dto;

import java.io.Serializable;
import java.util.Date;

public class Accept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String positionName;
	private String postTime;
	private Integer postId;
	  public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	/**
     * 主键，自增
     */
    private Integer resumeId;

    /**
     * 外键，关联用户表
     */
    private Integer userId;

    /**
     * 简历用户姓名
     */
    private String userName;

    /**
     * 用户性别
     */
    private String userGender;

    /**
     * 用户生日，年/月
     */
    private String userBirthday;

    /**
     * 用户最高学历【大专、本、硕、博、其它】
     */
    private String userEducation;

    /**
     * 用户最高年限【应届毕业生、1、2、3~10、10年以上】
     */
    private String userWorkyears;

    /**
     * 所在城市
     */
    private String userCity;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户电话号码
     */
    private String userPhone;

    /**
     * 用户头像地址,可为空
     */
    private String userImage;

    /**
     * 用户一句话自我评价
     */
    private String userSelfvaluation;


    public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPostTime() {
		return postTime;
	}

	public void setPostTime(String postTime) {
		this.postTime = postTime;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    public String getUserWorkyears() {
        return userWorkyears;
    }

    public void setUserWorkyears(String userWorkyears) {
        this.userWorkyears = userWorkyears;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserSelfvaluation() {
        return userSelfvaluation;
    }

    public void setUserSelfvaluation(String userSelfvaluation) {
        this.userSelfvaluation = userSelfvaluation;
    }
}
