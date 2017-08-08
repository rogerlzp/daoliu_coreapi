package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.wy.common.model.GeneralEnter;

public class InvestmentEnter extends GeneralEnter implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 6497758619442286089L;
	private long userId;
	private int orderId;
	private String orderNo;
	private String status;
	private String orderStatus;
	private double birdConRevenue;
	private double cashBackCoupon;
	private double annualIncome;
	private String annualIncomeText;
	private int productDeadLine;
	private String productDeadlineUnit;
	private Date startRateDate;
	private Date convertDate;
	private Date raiseEndDate;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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

	public Date getStartRateDate() {
		return startRateDate;
	}

	public void setStartRateDate(Date startRateDate) {
		this.startRateDate = startRateDate;
	}

	public Date getConvertDate() {
		return convertDate;
	}

	public void setConvertDate(Date convertDate) {
		this.convertDate = convertDate;
	}

	public Date getRaiseEndDate() {
		return raiseEndDate;
	}

	public void setRaiseEndDate(Date raiseEndDate) {
		this.raiseEndDate = raiseEndDate;
	}

}
