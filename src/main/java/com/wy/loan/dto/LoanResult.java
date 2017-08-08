package com.wy.loan.dto;

import java.util.List;

import com.wy.common.model.GeneralResult;
import com.wy.pc.loan.dto.Intent;

public class LoanResult extends GeneralResult {
	private static final long serialVersionUID = -2963850520002326453L;
	private List<Intent> intents;
	public List<Intent> getIntents() {
		return intents;
	}
	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}
}
