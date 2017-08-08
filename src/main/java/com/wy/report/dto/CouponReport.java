package com.wy.report.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/1/21.
 */
public class CouponReport implements Serializable {
    private static final long serialVersionUID = 8670363689706952521L;
    private String activityType;
    private String amount;
    private String status;
    private int number;
    private int syzNumber;
    private int yxNumber;
    private int zfNumber;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSyzNumber() {
        return syzNumber;
    }

    public void setSyzNumber(int syzNumber) {
        this.syzNumber = syzNumber;
    }

    public int getYxNumber() {
        return yxNumber;
    }

    public void setYxNumber(int yxNumber) {
        this.yxNumber = yxNumber;
    }

    public int getZfNumber() {
        return zfNumber;
    }

    public void setZfNumber(int zfNumber) {
        this.zfNumber = zfNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
