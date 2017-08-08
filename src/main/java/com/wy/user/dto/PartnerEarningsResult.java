package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class PartnerEarningsResult  extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -3430326369879297150L;
	private List<PartnerEarnings> listPartnerEarnings;

	public List<PartnerEarnings> getListPartnerEarnings() {
		return listPartnerEarnings;
	}

	public void setListPartnerEarnings(List<PartnerEarnings> listPartnerEarnings) {
		this.listPartnerEarnings = listPartnerEarnings;
	}
	
}
