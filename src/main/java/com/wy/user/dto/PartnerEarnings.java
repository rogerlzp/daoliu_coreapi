package com.wy.user.dto;

import java.io.Serializable;

public class PartnerEarnings implements Serializable{


	private static final long serialVersionUID = 962202172390755708L;
	private double reward;
	private String mobileNo;
	private double orderReward;
	public double getReward() {
		return reward;
	}
	public void setReward(double reward) {
		this.reward = reward;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getOrderReward() {
		return orderReward;
	}
	public void setOrderReward(double orderReward) {
		this.orderReward = orderReward;
	}
}
