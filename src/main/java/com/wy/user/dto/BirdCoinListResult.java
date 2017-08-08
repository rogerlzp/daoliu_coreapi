package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wy.common.model.GeneralResult;

public class BirdCoinListResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -8691453189780450019L;
	private List<BirdCoin>  birdCoins;
	private double totalAmount;
	private String lastTotal;
    private String updateDate;//更新时间
    
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public List<BirdCoin> getBirdCoins() {
		return birdCoins;
	}

	public void setBirdCoins(List<BirdCoin> birdCoins) {
		this.birdCoins = birdCoins;
	}

	public String getLastTotal() {
		return lastTotal;
	}

	public void setLastTotal(String lastTotal) {
		this.lastTotal = lastTotal;
	}
	
}
