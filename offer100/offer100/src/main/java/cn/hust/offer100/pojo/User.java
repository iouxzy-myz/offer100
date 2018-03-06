package cn.hust.offer100.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户ID，自增
     */
    private Integer userId;

    /**
     * 用户登录名
     */
    private String userName;

    /**
     * 用户登录密码
     */
    private String userPassword;

    /**
     * 用户类型【企业用户，普通用户或管理员】
     */
    private String userType;

    private static final long serialVersionUID = 1L;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}