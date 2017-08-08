package com.wy.user.dto;

import java.io.Serializable;

public class PartnerTotal implements Serializable{
	
	private static final long serialVersionUID = -7833819841657922077L;
	
	private double totalReward;

	public double getTotalReward() {
		return totalReward;
	}

	public void setTotalReward(double totalReward) {
		this.totalReward = totalReward;
	}
}
