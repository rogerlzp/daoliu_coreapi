package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Investment implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 434917659479916768L;
	private int orderId;
	private String orderNo;
	private String status;
	private double birdConRevenue;
	private double cashBackCoupon;
	private double annualIncome;
	private String annualIncomeText;
	private int productDeadLine;
	private double orderAmount;
	@JSONField(format = "yyyy-MM-dd")
	private Date orderDate;
	private String orderRevenue;
	private String productDeadlineUnit;
	private String productType;
	private String productName;
	private String repaymentType;
	@JSONField(format = "yyyy-MM-dd")
	private Date startRateDate;
	private int convertDate;
	@JSONField(format = "yyyy-MM-dd")
	private Date raiseEndDate;
	private String expireDate;

	private String activityType;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBirdConRevenue() {
		return birdConRevenue;
	}

	public void setBirdConRevenue(double birdConRevenue) {
		this.birdConRevenue = birdConRevenue;
	}

	public double getCashBackCoupon() {
		return cashBackCoupon;
	}

	public void setCashBackCoupon(double cashBackCoupon) {
		this.cashBackCoupon = cashBackCoupon;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getAnnualIncomeText() {
		return annualIncomeText;
	}

	public void setAnnualIncomeText(String annualIncomeText) {
		this.annualIncomeText = annualIncomeText;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderRevenue() {
		return orderRevenue;
	}

	public void setOrderRevenue(String orderRevenue) {
		this.orderRevenue = orderRevenue;
	}

	public int getProductDeadLine() {
		return productDeadLine;
	}

	public void setProductDeadLine(int productDeadLine) {
		this.productDeadLine = productDeadLine;
	}

	public String getProductDeadlineUnit() {
		return productDeadlineUnit;
	}

	public void setProductDeadlineUnit(String productDeadlineUnit) {
		this.productDeadlineUnit = productDeadlineUnit;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRepaymentType() {
		return repaymentType;
	}

	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

	public Date getStartRateDate() {
		return startRateDate;
	}

	public void setStartRateDate(Date startRateDate) {
		this.startRateDate = startRateDate;
	}

	public int getConvertDate() {
		return convertDate;
	}

	public void setConvertDate(int convertDate) {
		this.convertDate = convertDate;
	}

	public Date getRaiseEndDate() {
		return raiseEndDate;
	}

	public void setRaiseEndDate(Date raiseEndDate) {
		this.raiseEndDate = raiseEndDate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

}
