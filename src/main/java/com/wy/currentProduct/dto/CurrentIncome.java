package com.wy.currentProduct.dto;

import java.io.Serializable;

public class CurrentIncome implements Serializable{

	private static final long serialVersionUID = -1583099069490594897L;
	
	private double income;
	private String time;
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
