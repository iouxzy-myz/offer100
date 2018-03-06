package cn.hust.offer100.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Check implements Serializable {
    /**
     * 本表ID 自增
     */
    private Integer id;
    

    /**
     * 外键，企业用户ID，关联用户表
     */
    private Integer userId;

    /**
     * 企业营业执照图片地址
     */
    private String enterpriseUrl;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 企业邮箱
     */
    private String enterpriseEmail;

    /**
     * 创建时间、详细时间
     */
    private Date createTime;

    /**
     * 审核状态，默认 0 待审核，1，审核通过，2 审核不通过
     */
    private String status;

    /**
     * 审核不通过原因，默认空
     */
    private String reason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEnterpriseUrl() {
        return enterpriseUrl;
    }

    public void setEnterpriseUrl(String enterpriseUrl) {
        this.enterpriseUrl = enterpriseUrl;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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