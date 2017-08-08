package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 用户登录
 * Created by liuyw on 2015/12/25.
 */
public class UserLevel  implements Serializable {

    private static final long serialVersionUID = -3838792339175482239L;
    private Integer id;
    private String  level;



    private Integer userId;
    private Integer orderId;
    private Integer fatherId;
    private Integer grandFatherId;
    private Date createDate;
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getGrandFatherId() {
        return grandFatherId;
    }

    public void setGrandFatherId(Integer grandFatherId) {
        this.grandFatherId = grandFatherId;
    }
}
