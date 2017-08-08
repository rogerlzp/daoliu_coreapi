package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

public class UserQueryEnter extends GeneralEnter {

	private static final long serialVersionUID = -5434836707491866717L;
	private String machineNo;// 机器唯一码
	private String mobileNo;// 手机号码
	private String password;// 密码
	private String pictureCode;// 图像验证码
	private String ip;// 用户登录的ip地址

	private String registrationId;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPictureCode() {
		return pictureCode;
	}

	public void setPictureCode(String pictureCode) {
		this.pictureCode = pictureCode;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

}
