package com.wy.pc.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class PcCurrentInOutDetailsEnter extends GeneralEnter implements Serializable {

	private static final long serialVersionUID = 3359318288063434334L;
	
	private String type;//ZR-转入 ZC-转出
	
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
