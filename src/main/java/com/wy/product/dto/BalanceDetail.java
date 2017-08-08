package com.wy.product.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/29.
 */
public class BalanceDetail implements Serializable {


    private static final long serialVersionUID = -1498004049831777281L;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operateDate;//发生时间
    private String operateType;//发生类型
    private String productName;//产品名称
    private double amount;//发生金额
    private String amountText;//发生金额
    private String cashbackCoupon;//返现券面额
    private double total;//当前余额

    public String getAmountText() {
        return amountText;
    }
    public void setAmountText(String amountText) {
        this.amountText = amountText;
    }
    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCashbackCoupon() {
        return cashbackCoupon;
    }

    public void setCashbackCoupon(String cashbackCoupon) {
        this.cashbackCoupon = cashbackCoupon;
    }

    public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
    public String toString() {
        return "BalanceDetail{" +
                "operateDate=" + operateDate +
                ", operateType='" + operateType + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                ", amountText='" + amountText + '\'' +
                ", cashbackCoupon='" + cashbackCoupon + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
