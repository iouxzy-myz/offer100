package cn.hust.offer100.pojo;

import java.util.Date;

public class ResumeFundation {
    private Integer resumeId;

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
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
        this.userEducation = userEducation == null ? null : userEducation.trim();
    }

    public String getUserWorkyears() {
        return userWorkyears;
    }

    public void setUserWorkyears(String userWorkyears) {
        this.userWorkyears = userWorkyears == null ? null : userWorkyears.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getUserSelfvaluation() {
        return userSelfvaluation;
    }

    public void setUserSelfvaluation(String userSelfvaluation) {
        this.userSelfvaluation = userSelfvaluation == null ? null : userSelfvaluation.trim();
    }
}