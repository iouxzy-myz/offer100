package cn.hust.offer100.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Manager implements Serializable {
    /**
     * 本表ID
     */
    private Integer id;

    /**
     * 管理员登录名，唯一
     */
    private String userName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 管理员类型
     */
    private String usertype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}