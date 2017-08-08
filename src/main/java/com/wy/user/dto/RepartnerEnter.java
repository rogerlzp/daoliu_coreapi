package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhangnz on 2015/12/29.
 */
public class RepartnerEnter extends GeneralEnter implements Serializable {
	private static final long serialVersionUID = 3893158817815188353L;
	private String mobileNo;//手机号码
	private String userMobileNo;//手机号码
	private long userId;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
}
