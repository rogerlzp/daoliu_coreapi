package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class IndexLongProductResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = -2053709530215020397L;
	
	private List<LongProduct> longList;

	public List<LongProduct> getLongList() {
		return longList;
	}

	public void setLongList(List<LongProduct> longList) {
		this.longList = longList;
	}
	

}
