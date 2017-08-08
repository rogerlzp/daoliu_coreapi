package com.wy.loan.dto;

import java.util.List;

import com.wy.common.model.GeneralResult;

public class LoanTypeResult extends GeneralResult {

	private static final long serialVersionUID = -4590038479283336838L;
	private List<LoanType> loanTypes;
	public List<LoanType> getLoanTypes() {
		return loanTypes;
	}
	public void setLoanTypes(List<LoanType> loanTypes) {
		this.loanTypes = loanTypes;
	}

}
