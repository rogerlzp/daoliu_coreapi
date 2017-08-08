package com.wy.user.dto;

import java.io.Serializable;

/**
 * 我推荐的好友
 * @author yg
 *
 */
public class Friends implements Serializable{
	
	private static final long serialVersionUID = 7254002732713936782L;
	
	private String registeredNum;//已注册人数
	private String realNameNum;//实名认证人数
	private String investNum;//已投资人数
	
	public String getRegisteredNum() {
		return registeredNum;
	}
	public void setRegisteredNum(String registeredNum) {
		this.registeredNum = registeredNum;
	}
	public String getRealNameNum() {
		return realNameNum;
	}
	public void setRealNameNum(String realNameNum) {
		this.realNameNum = realNameNum;
	}
	public String getInvestNum() {
		return investNum;
	}
	public void setInvestNum(String investNum) {
		this.investNum = investNum;
	}
	
}
