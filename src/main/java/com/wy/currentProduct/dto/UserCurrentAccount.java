package com.wy.currentProduct.dto;

import java.io.Serializable;

public class UserCurrentAccount implements Serializable{

	private static final long serialVersionUID = -2862801657035648770L;
	
	private long userId;
	private double balance;
	private double totalIncome;
	private double lastdayIncome;
	private String createDate;
	private String updateDate;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}
	public double getLastdayIncome() {
		return lastdayIncome;
	}
	public void setLastdayIncome(double lastdayIncome) {
		this.lastdayIncome = lastdayIncome;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
}
