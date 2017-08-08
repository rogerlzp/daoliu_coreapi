package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class IndexShortProductResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = -2053709530215020397L;
	
	private List<ShortProduct> shortList;

	public List<ShortProduct> getShortList() {
		return shortList;
	}

	public void setShortList(List<ShortProduct> shortList) {
		this.shortList = shortList;
	}
	

}
