package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 职位
 */
public class Position implements Serializable {
    /**
     * 本表id，自增
     */
    private Integer id;

    /**
     * 外键，企业id关联企业表
     */
    private Integer enterpriseId;

    /**
     * 外键，企业用户id，关联用户表
     */
    private Integer userId;

    /**
     * 职位名称
     */
    private String positionName;

    /**
     * 职位类别，【Java、C++等】
     */
    private String positionCategory;

    /**
     * 职位招聘人数
     */
    private Integer positionNum;

    /**
     * 工作详细地址，如上海 - 杨浦区 - 长阳路1687号长阳创谷
     */
    private String positionAddress;

    /**
     * 工作城市
     */
    private String positionCity;

    /**
     * 职位诱惑
     */
    private String positionTemptation;

    /**
     * 职位描述
     */
    private String positionDetails;

    /**
     * 职位最低工资(注意已修改回去）
     */
    private Integer positionMinwage;

    /**
     * 职位最高工资（注意已修改回去）
     */
    private Integer positionMaxwage;

    /**
     * 工作经验要求，【不限、应届毕业生、经验1~3年、经验3~5、5~10年、10年以上】
     */
    private String positionExperience;

    /**
     * 职位学历要求【不限、大专、本科等】
     */
    private String positionEducation;

    /**
     * 职位创建时间，【年月日时间】，为简化，更新时间也在其中更新
     */
    private Date positionCreattime;

    /**
     * 职位工作性质，【全职，兼职，实习】
     */
    private String positionNature;

    /**
     * 职位当前状态【0、待审核 1、上线 2、下线 3、审核不通过 -1、逻辑删除】
     */
    private String positionStatus;

    /**
     * 不通过原因，默认为空，重新审核记得不通过原因记得修改成空

     */
    private String positionReason;
    
    private String num;//投递数量
    
    private String time;//创建时间
    

    public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionCategory() {
        return positionCategory;
    }

    public void setPositionCategory(String positionCategory) {
        this.positionCategory = positionCategory;
    }

    public Integer getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(Integer positionNum) {
        this.positionNum = positionNum;
    }

    public String getPositionAddress() {
        return positionAddress;
    }

    public void setPositionAddress(String positionAddress) {
        this.positionAddress = positionAddress;
    }

    public String getPositionCity() {
        return positionCity;
    }

    public void setPositionCity(String positionCity) {
        this.positionCity = positionCity;
    }

    public String getPositionTemptation() {
        return positionTemptation;
    }

    public void setPositionTemptation(String positionTemptation) {
        this.positionTemptation = positionTemptation;
    }

    public String getPositionDetails() {
        return positionDetails;
    }

    public void setPositionDetails(String positionDetails) {
        this.positionDetails = positionDetails;
    }

    public Integer getPositionMinwage() {
        return positionMinwage;
    }

    public void setPositionMinwage(Integer positionMinwage) {
        this.positionMinwage = positionMinwage;
    }

    public Integer getPositionMaxwage() {
        return positionMaxwage;
    }

    public void setPositionMaxwage(Integer positionMaxwage) {
        this.positionMaxwage = positionMaxwage;
    }

    public String getPositionExperience() {
        return positionExperience;
    }

    public void setPositionExperience(String positionExperience) {
        this.positionExperience = positionExperience;
    }

    public String getPositionEducation() {
        return positionEducation;
    }

    public void setPositionEducation(String positionEducation) {
        this.positionEducation = positionEducation;
    }

    public Date getPositionCreattime() {
        return positionCreattime;
    }

    public void setPositionCreattime(Date positionCreattime) {
        this.positionCreattime = positionCreattime;
    }

    public String getPositionNature() {
        return positionNature;
    }

    public void setPositionNature(String positionNature) {
        this.positionNature = positionNature;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getPositionReason() {
        return positionReason;
    }

    public void setPositionReason(String positionReason) {
        this.positionReason = positionReason;
    }
}