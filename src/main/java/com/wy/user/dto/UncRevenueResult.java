package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class UncRevenueResult extends GeneralResult implements Serializable{
	
	private static final long serialVersionUID = 8291827466470826897L;

	private double uncRevenueTotal;
	
	private double couponTotal;//返现券收益汇总
	
	private double financeTotal;//理财收益汇总
	
	private double birdTotal;//鸟币收益汇总
	
	private double currentTotal;//随心投收益汇总
	
	private double partnerTotal;//合伙人收益汇总
	
	public double getCouponTotal() {
		return couponTotal;
	}

	public void setCouponTotal(double couponTotal) {
		this.couponTotal = couponTotal;
	}

	public double getFinanceTotal() {
		return financeTotal;
	}

	public void setFinanceTotal(double financeTotal) {
		this.financeTotal = financeTotal;
	}

	public double getBirdTotal() {
		return birdTotal;
	}

	public void setBirdTotal(double birdTotal) {
		this.birdTotal = birdTotal;
	}

	public double getCurrentTotal() {
		return currentTotal;
	}

	public void setCurrentTotal(double currentTotal) {
		this.currentTotal = currentTotal;
	}

	public double getPartnerTotal() {
		return partnerTotal;
	}

	public void setPartnerTotal(double partnerTotal) {
		this.partnerTotal = partnerTotal;
	}

	private List<UncRevenue> uncRevenueList;

	public double getUncRevenueTotal() {
		return uncRevenueTotal;
	}

	public void setUncRevenueTotal(double uncRevenueTotal) {
		this.uncRevenueTotal = uncRevenueTotal;
	}

	public List<UncRevenue> getUncRevenueList() {
		return uncRevenueList;
	}

	public void setUncRevenueList(List<UncRevenue> uncRevenueList) {
		this.uncRevenueList = uncRevenueList;
	}
	
}
