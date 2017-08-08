package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class IndexCurrentProductResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = -6093100824467980673L;
	
	private IndexCurrentProduct sxt;

	public IndexCurrentProduct getSxt() {
		return sxt;
	}

	public void setSxt(IndexCurrentProduct sxt) {
		this.sxt = sxt;
	}

	


}
