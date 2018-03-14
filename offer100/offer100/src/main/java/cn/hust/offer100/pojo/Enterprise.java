package cn.hust.offer100.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Enterprise implements Serializable {
    /**
     * 本表id,自增
     */
    private Integer enterpriseId;

    /**
     * 外键，关联用户表，企业用户id
     */
    private Integer userId;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 企业Logo图片存放地址
     */
    private String enterpriseLogourl;

    /**
     * 企业官网
     */
    private String enterpriseWebsite;

    /**
     * 企业联系电话
     */
    private String enterprisePhone;

    /**
     * 企业联系邮箱
     */
    private String enterpriseEmail;

    /**
     * 企业所在城市
     */
    private String enterpriseCity;

    /**
     * 企业行业领域
     */
    private String enterpriseSector;

    /**
     * 企业规模
     */
    private String enterpriseScale;

    /**
     * 企业简介
     */
    private String enterpriseProfile;

    /**
     * 企业介绍
     */
    private String enterpriseDetails;
    
    /**
     * 审核状态，默认 0 待审核，1，审核通过，2 审核不通过
     */
    private String status;

    /**
     * 审核不通过原因，默认空
     */
    private String reason;
    

    private static final long serialVersionUID = 1L;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseLogourl() {
        return enterpriseLogourl;
    }

    public void setEnterpriseLogourl(String enterpriseLogourl) {
        this.enterpriseLogourl = enterpriseLogourl;
    }

    public String getEnterpriseWebsite() {
        return enterpriseWebsite;
    }

    public void setEnterpriseWebsite(String enterpriseWebsite) {
        this.enterpriseWebsite = enterpriseWebsite;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public String getEnterpriseSector() {
        return enterpriseSector;
    }

    public void setEnterpriseSector(String enterpriseSector) {
        this.enterpriseSector = enterpriseSector;
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public String getEnterpriseProfile() {
        return enterpriseProfile;
    }

    public void setEnterpriseProfile(String enterpriseProfile) {
        this.enterpriseProfile = enterpriseProfile;
    }

    public String getEnterpriseDetails() {
        return enterpriseDetails;
    }

    public void setEnterpriseDetails(String enterpriseDetails) {
        this.enterpriseDetails = enterpriseDetails;
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
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
    
}