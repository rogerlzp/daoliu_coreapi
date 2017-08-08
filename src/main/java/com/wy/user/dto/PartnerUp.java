package com.wy.user.dto;

import java.io.Serializable;

public class PartnerUp implements Serializable{

	private static final long serialVersionUID = 8099191137206205958L;
	
	private Integer num;
	
	private String mobile;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
