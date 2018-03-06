package cn.hust.offer100.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class UserCollection implements Serializable {
    /**
     * 收藏表ID，自增
     */
    private Integer collectionId;

    /**
     * 用户ID，外键对应用户表
     */
    private Integer userId;

    /**
     * 职位ID，外键对应职位表
     */
    private Integer positionId;

    private static final long serialVersionUID = 1L;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
}