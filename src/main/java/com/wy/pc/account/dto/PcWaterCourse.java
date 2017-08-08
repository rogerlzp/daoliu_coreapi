package com.wy.pc.account.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/2.
 */
public class PcWaterCourse implements Serializable {
    private static final long serialVersionUID = 4767658660051979392L;
    private String orderNo;
    private double amount;
    private String status;
    private String operateDate;
    private String operateType;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
