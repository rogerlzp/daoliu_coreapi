package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class InvestmentResult   extends GeneralResult implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -4238446337954143983L;
	private List<Investment> investments;

	public List<Investment> getInvestments() {
		return investments;
	}
	public void setInvestments(List<Investment> investments) {
		this.investments = investments;
	}
}
