package com.wy.currentProduct.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class CurrentIncomeListResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = 4487516646349415960L;
	private double currentTotalIncome;
	
	private List<CurrentIncome> currentIncomeList;

	public double getCurrentTotalIncome() {
		return currentTotalIncome;
	}

	public void setCurrentTotalIncome(double currentTotalIncome) {
		this.currentTotalIncome = currentTotalIncome;
	}

	public List<CurrentIncome> getCurrentIncomeList() {
		return currentIncomeList;
	}

	public void setCurrentIncomeList(List<CurrentIncome> currentIncomeList) {
		this.currentIncomeList = currentIncomeList;
	}
	
}
