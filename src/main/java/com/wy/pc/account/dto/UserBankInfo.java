package com.wy.pc.account.dto;

import java.io.Serializable;

public class UserBankInfo implements Serializable{
	
	private static final long serialVersionUID = 7616845850000996611L;
	
	private String userName;
	private String bankNo;
	private String belongBank;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getBelongBank() {
		return belongBank;
	}
	public void setBelongBank(String belongBank) {
		this.belongBank = belongBank;
	}
	
}
