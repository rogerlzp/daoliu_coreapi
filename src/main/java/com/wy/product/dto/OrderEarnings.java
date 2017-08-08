package com.wy.product.dto;

import java.io.Serializable;

/**
 * 投资订单收益（代收已收）
 * 
 * @author
 * 
 */
public class OrderEarnings implements Serializable {

	private static final long serialVersionUID = -8420540867839260343L;

	private String productName;// 产品名称
	private String orderDate;// 下单时间
	private double orderAmount;// 订单金额
	private double annualIncome;// 年化收益
	private int productDeadLine;// 产品期限
	private String deadLineUnit;// 产品期限单位
	private String rateCalculateType;// 起息计算方式
	private String cashbackCouponName;// 返现券名称
	private double denomination;// 返现券金额
	private int convertDay;// 折算天
	private String auctionDate;//结标时间

	private String activityType;

	public int getConvertDay() {
		return convertDay;
	}

	public void setConvertDay(int convertDay) {
		this.convertDay = convertDay;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
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

	public int getProductDeadLine() {
		return productDeadLine;
	}

	public void setProductDeadLine(int productDeadLine) {
		this.productDeadLine = productDeadLine;
	}

	public String getDeadLineUnit() {
		return deadLineUnit;
	}

	public void setDeadLineUnit(String deadLineUnit) {
		this.deadLineUnit = deadLineUnit;
	}

	public String getRateCalculateType() {
		return rateCalculateType;
	}

	public void setRateCalculateType(String rateCalculateType) {
		this.rateCalculateType = rateCalculateType;
	}

	public String getCashbackCouponName() {
		return cashbackCouponName;
	}

	public void setCashbackCouponName(String cashbackCouponName) {
		this.cashbackCouponName = cashbackCouponName;
	}

	public double getDenomination() {
		return denomination;
	}

	public void setDenomination(double denomination) {
		this.denomination = denomination;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAuctionDate() {
		return auctionDate;
	}

	public void setAuctionDate(String auctionDate) {
		this.auctionDate = auctionDate;
	}

}
