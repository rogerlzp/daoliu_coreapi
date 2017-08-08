package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by znz on 2015/12/29.
 */
public class Repartner implements Serializable {
    private static final long serialVersionUID = 816989063523849808L;
    private long id;
    private long userId;
    private long fatherId;
    private long grandFatherId;
    private Date joinDate;
    private String joinSource;

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(String joinSource) {
        this.joinSource = joinSource;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getFatherId() {
        return fatherId;
    }

    public void setFatherId(long fatherId) {
        this.fatherId = fatherId;
    }

    public long getGrandFatherId() {
        return grandFatherId;
    }

    public void setGrandFatherId(long grandFatherId) {
        this.grandFatherId = grandFatherId;
    }

}
