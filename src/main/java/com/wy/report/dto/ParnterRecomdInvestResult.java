package com.wy.report.dto;

import java.io.Serializable;

public class ParnterRecomdInvestResult implements Serializable {

	private static final long serialVersionUID = -6857898165339916422L;

	/**
	 * 手机号码
	 */
	private String mobileNumber;
	/**
	 * 推荐人ID
	 */
	private String fatherId;
	/**
	 * 推荐投资金额
	 */
	private Double orderAmount;
	
	/**
	 * 地区
	 */
	private String area;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFatherId() {
		return fatherId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
