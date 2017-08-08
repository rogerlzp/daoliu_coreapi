package com.wy.pc.account.dto;

import java.io.Serializable;

public class PcAccountAmount implements Serializable{

	private static final long serialVersionUID = -3259772644894786595L;
	private double amount;
	private String operateType;//类型
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOperateType() {
		return operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	
}
