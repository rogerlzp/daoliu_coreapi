package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class AccountResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = -2643287447831606798L;
    private int id;
    private int userId;
    private double totalAsset;//总资产
    private double usableBalance;//可用余额
    private double frozenAmount;//冻结金额
    private double collectCapital;//待收本金
    private double collectRevenue;//待收收益
    private double liveAmount;//活期收益
    private double sumRevenue;//总收益
    private double birdCoin;
    private double birdCoinRevenue;
    private String freeCounter;//每月免费提现次数
    private String plain;
    private String url;
    private String sign;
    private int sxtIsShow;//随心投是否显示  0-不显示，1-显示
    private int axtIsShow;//安心投是否显示  0-不显示，1-显示

    private int unreadMessageCount;//未读消息个数

	private Date createDate;//创建时间
    private Date updateDate;//修改时间

    public int getAxtIsShow() {
        return axtIsShow;
    }

    public void setAxtIsShow(int axtIsShow) {
        this.axtIsShow = axtIsShow;
    }

    public String getFreeCounter() {
        return freeCounter;
    }

    public void setFreeCounter(String freeCounter) {
        this.freeCounter = freeCounter;
    }

    public double getBirdCoin() {
		return birdCoin;
	}
	public void setBirdCoin(double birdCoin) {
		this.birdCoin = birdCoin;
	}
	
    public String getPlain() {
        return plain;
    }

    public void setPlain(String plain) {
        this.plain = plain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getBirdCoinRevenue() {
		return birdCoinRevenue;
	}
	public void setBirdCoinRevenue(double birdCoinRevenue) {
		this.birdCoinRevenue = birdCoinRevenue;
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

	public int getSxtIsShow() {
		return sxtIsShow;
	}

	public void setSxtIsShow(int sxtIsShow) {
		this.sxtIsShow = sxtIsShow;
	}

	public int getUnreadMessageCount() {
		return unreadMessageCount;
	}

	public void setUnreadMessageCount(int unreadMessageCount) {
		this.unreadMessageCount = unreadMessageCount;
	}
}
