package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class PartnerResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = 5520748726668452502L;
	private double totalReward;
	
	private String userLerver;
	
	private int isPartnerUp;
	
	private int isPartnerDown;
	
	private String mobile;
	
	private int isStaff;//是否是内部员工   0-不是  1-是
	
	public int getIsPartnerUp() {
		return isPartnerUp;
	}

	public void setIsPartnerUp(int isPartnerUp) {
		this.isPartnerUp = isPartnerUp;
	}

	public int getIsPartnerDown() {
		return isPartnerDown;
	}

	public void setIsPartnerDown(int isPartnerDown) {
		this.isPartnerDown = isPartnerDown;
	}

	public double getTotalReward() {
		return totalReward;
	}

	public void setTotalReward(double totalReward) {
		this.totalReward = totalReward;
	}

	public String getUserLerver() {
		return userLerver;
	}

	public void setUserLerver(String userLerver) {
		this.userLerver = userLerver;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(int isStaff) {
		this.isStaff = isStaff;
	}
	
}
