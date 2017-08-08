package com.wy.user.dto;

import java.io.Serializable;

public class UserAccountInfo implements Serializable{


	private static final long serialVersionUID = -5043160820026936368L;
	private String isRealName;
	private String isBankCard;

	private String isBasicInfo;
	private String isApplySubmit;
	
	public String getIsRealName() {
		return isRealName;
	}
	public void setIsRealName(String isRealName) {
		this.isRealName = isRealName;
	}
	public String getIsBankCard() {
		return isBankCard;
	}
	public void setIsBankCard(String isBankCard) {
		this.isBankCard = isBankCard;
	}

	public String getIsBasicInfo() {
		return isBasicInfo;
	}

	public void setIsBasicInfo(String isBasicInfo) {
		this.isBasicInfo = isBasicInfo;
	}

	public String getIsApplySubmit() {
		return isApplySubmit;
	}

	public void setIsApplySubmit(String isApplySubmit) {
		this.isApplySubmit = isApplySubmit;
	}
}
