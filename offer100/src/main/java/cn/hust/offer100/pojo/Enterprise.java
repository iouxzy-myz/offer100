package cn.hust.offer100.pojo;

public class Enterprise {
    private Integer enterpriseId;

    private Integer userId;

    private String enterpriseName;

    private String enterpriseLogourl;

    private String enterpriseWebsite;

    private String enterprisePhone;

    private String enterpriseEmail;

    private String enterpriseCity;

    private String enterpriseSector;

    private String enterpriseScale;

    private String enterpriseProfile;

    private String enterpriseDetails;

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
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseLogourl() {
        return enterpriseLogourl;
    }

    public void setEnterpriseLogourl(String enterpriseLogourl) {
        this.enterpriseLogourl = enterpriseLogourl == null ? null : enterpriseLogourl.trim();
    }

    public String getEnterpriseWebsite() {
        return enterpriseWebsite;
    }

    public void setEnterpriseWebsite(String enterpriseWebsite) {
        this.enterpriseWebsite = enterpriseWebsite == null ? null : enterpriseWebsite.trim();
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone == null ? null : enterprisePhone.trim();
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail == null ? null : enterpriseEmail.trim();
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity == null ? null : enterpriseCity.trim();
    }

    public String getEnterpriseSector() {
        return enterpriseSector;
    }

    public void setEnterpriseSector(String enterpriseSector) {
        this.enterpriseSector = enterpriseSector == null ? null : enterpriseSector.trim();
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale == null ? null : enterpriseScale.trim();
    }

    public String getEnterpriseProfile() {
        return enterpriseProfile;
    }

    public void setEnterpriseProfile(String enterpriseProfile) {
        this.enterpriseProfile = enterpriseProfile == null ? null : enterpriseProfile.trim();
    }

    public String getEnterpriseDetails() {
        return enterpriseDetails;
    }

    public void setEnterpriseDetails(String enterpriseDetails) {
        this.enterpriseDetails = enterpriseDetails == null ? null : enterpriseDetails.trim();
    }
}