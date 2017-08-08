package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class PcCurrentInOutDetailsResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = 7232833342834951114L;
	private  List<PcCurrentInOutDetail> currentList;
	
	public List<PcCurrentInOutDetail> getCurrentList() {
		return currentList;
	}
	public void setCurrentList(List<PcCurrentInOutDetail> currentList) {
		this.currentList = currentList;
	}
	
	
	
}
