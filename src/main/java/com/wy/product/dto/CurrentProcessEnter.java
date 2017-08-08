package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/1/22.
 */
public class CurrentProcessEnter extends GeneralEnter implements Serializable {

    private String mobileNO;
    private String orderNo;

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "CurrentProcessEnter{" +
                "mobileNO='" + mobileNO + '\'' +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
