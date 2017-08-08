package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class PartnerEnter extends GeneralEnter implements Serializable {


	private static final long serialVersionUID = 8427710255942457632L;
	private Long userId;// 用户编号
	
	private int type;//0-我邀请的好友  1-我好友邀请的好友

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
}
