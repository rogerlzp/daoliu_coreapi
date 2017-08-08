package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class UserFriendEnter extends GeneralEnter implements Serializable{


	private static final long serialVersionUID = -1613949624042031184L;
	
	private String type;
	
	private long userId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
