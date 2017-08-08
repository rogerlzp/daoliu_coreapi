package com.wy.pc.account.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class PcAccountAmountWaterResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = -3751933453559159497L;
	
	private double txTotalAmount;//提现总金额
	private double czTotalAmount;//充值总金额
	private String userName;//持卡人姓名
	private String bankName;
	private String bankCard;//银行卡号
	
	public double getTxTotalAmount() {
		return txTotalAmount;
	}
	public void setTxTotalAmount(double txTotalAmount) {
		this.txTotalAmount = txTotalAmount;
	}
	public double getCzTotalAmount() {
		return czTotalAmount;
	}
	public void setCzTotalAmount(double czTotalAmount) {
		this.czTotalAmount = czTotalAmount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
}
