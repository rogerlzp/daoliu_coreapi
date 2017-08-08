package com.wy.user.dto;

import java.io.Serializable;

public class CollectRevenue implements Serializable{


	private static final long serialVersionUID = 4684399115658497024L;
	private double annualIncome;
	private double orderAmount;
	private int productDeadLine;
	private String deadlineUnit;
	private int convertDay;
	
	public int getConvertDay() {
		return convertDay;
	}
	public void setConvertDay(int convertDay) {
		this.convertDay = convertDay;
	}
	public int getProductDeadLine() {
		return productDeadLine;
	}
	public void setProductDeadLine(int productDeadLine) {
		this.productDeadLine = productDeadLine;
	}
	public String getDeadlineUnit() {
		return deadlineUnit;
	}
	public void setDeadlineUnit(String deadlineUnit) {
		this.deadlineUnit = deadlineUnit;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}
