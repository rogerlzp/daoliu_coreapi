package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class AccountTotalResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -6347131640380242410L;
	private int userId;//用户编号
	private double totalAsset;//总资产
	private double usableBalance;//可用余额
	private double frozenAmount;//冻结金额
	private double collectCapital;//待收本金
	private double collectRevenue;//待收收益
	private double currentHoldAmount;//活期
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalAsset() {
		return totalAsset;
	}
	public void setTotalAsset(double totalAsset) {
		this.totalAsset = totalAsset;
	}
	public double getUsableBalance() {
		return usableBalance;
	}
	public void setUsableBalance(double usableBalance) {
		this.usableBalance = usableBalance;
	}
	public double getFrozenAmount() {
		return frozenAmount;
	}
	public void setFrozenAmount(double frozenAmount) {
		this.frozenAmount = frozenAmount;
	}
	public double getCollectCapital() {
		return collectCapital;
	}
	public void setCollectCapital(double collectCapital) {
		this.collectCapital = collectCapital;
	}
	public double getCollectRevenue() {
		return collectRevenue;
	}
	public void setCollectRevenue(double collectRevenue) {
		this.collectRevenue = collectRevenue;
	}
	public double getCurrentHoldAmount() {
		return currentHoldAmount;
	}
	public void setCurrentHoldAmount(double currentHoldAmount) {
		this.currentHoldAmount = currentHoldAmount;
	}
}
