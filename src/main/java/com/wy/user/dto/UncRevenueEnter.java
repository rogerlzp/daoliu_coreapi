package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class UncRevenueEnter extends GeneralEnter implements Serializable{


	private static final long serialVersionUID = -7777378872170992105L;
	private long userId;
	
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	

}
