package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class BirdCoinEnter extends GeneralEnter implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 6479972755553939166L;
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
