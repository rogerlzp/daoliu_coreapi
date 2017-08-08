package com.wy.pc.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class ProductDetailEnter extends GeneralEnter implements Serializable{

	private static final long serialVersionUID = -3562790773462691834L;
	
	private String id;//productId

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
