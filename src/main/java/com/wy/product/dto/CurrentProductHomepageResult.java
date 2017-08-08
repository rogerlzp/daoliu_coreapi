package com.wy.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class CurrentProductHomepageResult extends GeneralResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2340975215401230134L;

	private String annual_income_rate;

	private String per_million_income;

	private double total_income;

	private double lastday_income;

	private double applying_extract_amount;

	private double available_amount;

	private double current_hold_amount;

	private double current_total_amount;

	private double current_remain_amount;

	public String getAnnual_income_rate() {
		return annual_income_rate;
	}

	public void setAnnual_income_rate(String annual_income_rate) {
		this.annual_income_rate = annual_income_rate;
	}

	public String getPer_million_income() {
		return per_million_income;
	}

	public void setPer_million_income(String per_million_income) {
		this.per_million_income = per_million_income;
	}

	public double getTotal_income() {
		return total_income;
	}

	public void setTotal_income(Double total_income) {
		if (total_income == null) {
			this.total_income = 0;
		} else {
			this.total_income = total_income;
		}
	}

	public double getLastday_income() {
		return lastday_income;
	}

	public void setLastday_income(double lastday_income) {
		this.lastday_income = lastday_income;
	}

	public double getApplying_extract_amount() {
		return applying_extract_amount;
	}

	public void setApplying_extract_amount(Double applying_extract_amount) {
		if(applying_extract_amount == null){
			applying_extract_amount = 0D;
		}
		this.applying_extract_amount = applying_extract_amount;
	}

	public double getAvailable_amount() {
		return available_amount;
	}

	public void setAvailable_amount(Double available_amount) {
		if(available_amount == null){
			available_amount = 0D;
		}
		this.available_amount = available_amount;
	}

	public double getCurrent_hold_amount() {
		return current_hold_amount;
	}

	public void setCurrent_hold_amount(Double current_hold_amount) {
		if(current_hold_amount == null){
			current_hold_amount = 0D;
		}
		this.current_hold_amount = current_hold_amount;
	}

	public double getCurrent_total_amount() {
		return current_total_amount;
	}

	public void setCurrent_total_amount(Double current_total_amount) {
		if(current_total_amount == null){
			current_total_amount = 0D;
		}
		this.current_total_amount = current_total_amount;
	}

	public double getCurrent_remain_amount() {
		return current_remain_amount;
	}

	public void setCurrent_remain_amount(double current_remain_amount) {
		this.current_remain_amount = current_remain_amount;
	}

	@Override
	public String toString() {
		return "CurrentProductHomepage [annual_income_rate=" + annual_income_rate + ", per_million_income=" + per_million_income
				+ ", total_income=" + total_income + ", lastday_income=" + lastday_income + ", applying_extract_amount="
				+ applying_extract_amount + ", available_amount=" + available_amount + ", current_hold_amount=" + current_hold_amount
				+ ", current_total_amount=" + current_total_amount + ", current_remain_amount=" + current_remain_amount + "]";
	}

}
