package com.wy.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class ProductListResult extends GeneralResult implements Serializable{
	
	private static final long serialVersionUID = 6359813058148357242L;
	
	private List<ProductList> list;

	public List<ProductList> getList() {
		return list;
	}

	public void setList(List<ProductList> list) {
		this.list = list;
	}
	
}
