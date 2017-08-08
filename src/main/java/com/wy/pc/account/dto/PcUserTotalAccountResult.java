package com.wy.pc.account.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;
/**
 * pc总资产
 * @author yg
 *
 */
public class PcUserTotalAccountResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = 7355423145617223636L;
	
	private int userId;//用户编号
	private double totalAsset;//总资产
	private double usableBalance;//可用余额
	private double frozenAmount;//冻结金额
	private double collectCapital;//待收本金
	private double collectRevenue;//待收收益
	//private double currentHoldAmount;//活期
	
    private double birdCoin;//可用鸟币
    private double birdCoinRevenue;//待收鸟币
    
    private double sxtCollectCapital;//随心投待收本金
    private double lctCollectCapital;//乐巢投待收本金
    private double lctxlCollectCapital;//乐巢投系列待收本金
	
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
	public double getBirdCoin() {
		return birdCoin;
	}
	public void setBirdCoin(double birdCoin) {
		this.birdCoin = birdCoin;
	}
	public double getBirdCoinRevenue() {
		return birdCoinRevenue;
	}
	public void setBirdCoinRevenue(double birdCoinRevenue) {
		this.birdCoinRevenue = birdCoinRevenue;
	}
	public double getSxtCollectCapital() {
		return sxtCollectCapital;
	}
	public void setSxtCollectCapital(double sxtCollectCapital) {
		this.sxtCollectCapital = sxtCollectCapital;
	}
	public double getLctCollectCapital() {
		return lctCollectCapital;
	}
	public void setLctCollectCapital(double lctCollectCapital) {
		this.lctCollectCapital = lctCollectCapital;
	}
	public double getLctxlCollectCapital() {
		return lctxlCollectCapital;
	}
	public void setLctxlCollectCapital(double lctxlCollectCapital) {
		this.lctxlCollectCapital = lctxlCollectCapital;
	}
}
