package cn.hust.offer100.dto;

import java.io.Serializable;
import java.util.Date;

public class Accept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String interviewStatus;
    private Integer interviewId;
	private String delayTime;
	private String interviewTime;
	private Integer positionId;//职位id
	private String positionName;
	private String postTime;
	private Integer postId;//简历投递id
    private Integer resumeId;//简历id
    private Integer userId;
    private String userName;
    private String userGender;
    private Date userBirthday;
    private String userEducation;
    private String userWorkyears;
    private String userCity;
    private String userEmail;
    private String userPhone;
    private String userImage;
    private String userSelfvaluation;
    private String userEducationexperience;
    private String userInterships;
    private String userProject;
    private String userIntroduction;


	/**
	 * @return the interviewId
	 */
	public Integer getInterviewId() {
		return interviewId;
	}
	
    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }
    public String getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public String getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(String delayTime) {
		this.delayTime = delayTime;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

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

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
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

	/**
	 * @return the userEducationexperience
	 */
	public String getUserEducationexperience() {
		return userEducationexperience;
	}

	/**
	 * @param userEducationexperience the userEducationexperience to set
	 */
	public void setUserEducationexperience(String userEducationexperience) {
		this.userEducationexperience = userEducationexperience;
	}

	/**
	 * @return the userInterships
	 */
	public String getUserInterships() {
		return userInterships;
	}

	/**
	 * @param userInterships the userInterships to set
	 */
	public void setUserInterships(String userInterships) {
		this.userInterships = userInterships;
	}

	/**
	 * @return the userProject
	 */
	public String getUserProject() {
		return userProject;
	}

	/**
	 * @param userProject the userProject to set
	 */
	public void setUserProject(String userProject) {
		this.userProject = userProject;
	}

	/**
	 * @return the userIntroduction
	 */
	public String getUserIntroduction() {
		return userIntroduction;
	}

	/**
	 * @param userIntroduction the userIntroduction to set
	 */
	public void setUserIntroduction(String userIntroduction) {
		this.userIntroduction = userIntroduction;
	}

	

}
