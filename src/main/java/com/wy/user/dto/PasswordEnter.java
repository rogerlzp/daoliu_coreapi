package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * ClassName: PasswordEnter
 * 
 * @Description: update password enter parameter object
 * @author Ciro
 * @date 2015-11-25
 */
public class PasswordEnter extends GeneralEnter implements Serializable{

	private static final long serialVersionUID = 1203518273008836892L;
	/**
	 * @Fields primaryPwd : primary password
	 */
	private String primaryPwd;
	/**
	 * @Fields primaryPwd : new password
	 */
	private String newPwd;
	/**
	 * @Fields primaryPwd : Mobile verification code
	 */
	private String mobileCode;
	/**
	 * @Fields primaryPwd : Identity card
	 */
	private String idCard;
	/**
	 * @Fields primaryPwd : mobile No
	 */
	private String mobileNo;

	public String getPrimaryPwd() {
		return primaryPwd;
	}

	public void setPrimaryPwd(String primaryPwd) {
		this.primaryPwd = primaryPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
