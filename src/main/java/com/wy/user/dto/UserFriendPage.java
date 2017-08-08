package com.wy.user.dto;

import java.io.Serializable;

public class UserFriendPage implements Serializable {

	private static final long serialVersionUID = 8007977615365528340L;

	private String mobile;
	private String createDate;
	private String realName;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}
