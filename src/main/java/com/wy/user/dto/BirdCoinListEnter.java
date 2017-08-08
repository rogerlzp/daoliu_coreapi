package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class BirdCoinListEnter extends GeneralEnter implements Serializable {


	private static final long serialVersionUID = 2008997576916773009L;
	private Long userId;// 用户编号
	private String lastTotal;//

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLastTotal() {
		return lastTotal;
	}

	public void setLastTotal(String lastTotal) {
		this.lastTotal = lastTotal;
	}

}
