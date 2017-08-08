package com.wy.pc.mobile.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

public class PCMobileCodeEnter extends GeneralEnter implements Serializable{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3753498725307326816L;
	
	private String mobileNo;
	private String certification;
	private String mobileCode;
	private String idCard;
	private String sendType;//1.注册手机验证码发送 [校验是否注册]  2.忘记密码 [校验是否实名制]  3.其他


	private String machineNo;// 唯一码
	private String pictureCode;// 图像验证码

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getPictureCode() {
		return pictureCode;
	}

	public void setPictureCode(String pictureCode) {
		this.pictureCode = pictureCode;
	}
}
