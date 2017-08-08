package com.wy.pc.product.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/2/28.
 */
public class PcCurrentProductLast7DayIncome implements Serializable{
    private static final long serialVersionUID = -4109672231944274069L;
    private double income;
    private String createDate;

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
