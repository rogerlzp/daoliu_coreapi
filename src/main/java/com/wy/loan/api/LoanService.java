package com.wy.loan.api;

import com.wy.common.annotation.Role;
import com.wy.loan.dto.LoanEnter;
import com.wy.loan.dto.LoanResult;
import com.wy.loan.dto.LoanTypeResult;

public interface LoanService {
	@Role
	LoanResult submitLoanInfo (LoanEnter loanEnter);
	@Role
	LoanResult queryLoanInfo (LoanEnter loanEnter);
	LoanTypeResult queryLoanType();
}
