package com.wy.user.dto;

import java.io.Serializable;

/**
 *收益
 * @author yuge
 */
public class UncRevenue implements Serializable{
	
	private static final long serialVersionUID = 8909334040670543640L;
	
	private String earningName;//收益名称
	private String earningDate;//收益时间
	private double earning;//收益钱
	
	public String getEarningName() {
		return earningName;
	}
	public void setEarningName(String earningName) {
		this.earningName = earningName;
	}
	public String getEarningDate() {
		return earningDate;
	}
	public void setEarningDate(String earningDate) {
		this.earningDate = earningDate;
	}
	public double getEarning() {
		return earning;
	}
	public void setEarning(double earning) {
		this.earning = earning;
	}
	
	
}
