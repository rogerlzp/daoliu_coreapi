package com.wy.user.dto;

import java.io.Serializable;

public class UserCouponTotal implements Serializable {

	private static final long serialVersionUID = 8562478284308478765L;
	private double couponAmount;

	private String couponType;

	private long orderId;

	private double orderAmount;

	private double annualIncome;
	
	private int convertDay;

	public double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getConvertDay() {
		return convertDay;
	}

	public void setConvertDay(int convertDay) {
		this.convertDay = convertDay;
	}
	
	

}
