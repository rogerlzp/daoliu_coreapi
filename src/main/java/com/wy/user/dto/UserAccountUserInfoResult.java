package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;
import lombok.Data;

@Data
public class UserAccountUserInfoResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -6163362713109407068L;
	private String isRealName;
	private String isBankCard;
	private String isTradePwd;

	private String isBasicInfo;// 是否提交资本资料
	private String isApplySubmit;// 是否提交申请


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
	public String getIsTradePwd() {
		return isTradePwd;
	}
	public void setIsTradePwd(String isTradePwd) {
		this.isTradePwd = isTradePwd;
	}
	
}
