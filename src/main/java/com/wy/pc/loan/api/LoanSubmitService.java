package com.wy.pc.loan.api;

import com.wy.pc.loan.dto.LoanSubmitEnter;
import com.wy.pc.loan.dto.LoanSubmitResult;

/**
 * Created by znz on 2016/3/1.
 */
public interface LoanSubmitService {
    LoanSubmitResult submitLoanInfo (LoanSubmitEnter loanSubmitEnter);
}
