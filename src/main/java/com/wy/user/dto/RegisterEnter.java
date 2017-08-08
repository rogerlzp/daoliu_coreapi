package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/11/24.
 */
public class RegisterEnter extends GeneralEnter implements Serializable {


	private static final long serialVersionUID = 8697015303404646148L;
	private String machineNo;// 机器唯一码

	private String mobileNo;// 手机号码
	private String password;// 密码
	private String mobileCode;// 短信验证码
	private String partnerMobile;// 短信验证码
	private String readAndAgree;// 阅读并同意标志。1：阅读并同意；0：不同意

	private String registrationId;
	private String identityCode;
	private String userName;
	
	private String channel;//2016-04-01 注册用户来源渠道

	public String getIdentityCode() {
		return identityCode;
	}

	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getMobileCode() {
		return mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public String getReadAndAgree() {
		return readAndAgree;
	}

	public void setReadAndAgree(String readAndAgree) {
		this.readAndAgree = readAndAgree;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getPartnerMobile() {
		return partnerMobile;
	}

	public void setPartnerMobile(String partnerMobile) {
		this.partnerMobile = partnerMobile;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
