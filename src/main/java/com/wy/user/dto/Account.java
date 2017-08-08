package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class Account implements Serializable {
	private static final long serialVersionUID = 3230925640627080309L;
	private int id;
	private long userId;// 用户id
	private double totalAsset;// 总资产
	private double usableBalance;// 可用余额
	private double frozenAmount;// 冻结金额 投标中、提现中或提取处理中资金会暂时冻结，满标或资金解冻后资金会自动解冻
	private double collectCapital;// 待收本金
	private double collectRevenue;// 待收收益
	private double liveAmount;// 活期金额
	private double sumRevenue;// 累积收益包含：已赚投资收益，待收收益，理财师收益，活动奖励
	private Date createDate;
	private Date updateDate;
	private double birdCoinRevenue;
	private double birdCoin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
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

	public double getLiveAmount() {
		return liveAmount;
	}

	public void setLiveAmount(double liveAmount) {
		this.liveAmount = liveAmount;
	}

	public double getSumRevenue() {
		return sumRevenue;
	}

	public void setSumRevenue(double sumRevenue) {
		this.sumRevenue = sumRevenue;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
}
