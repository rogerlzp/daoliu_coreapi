package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class ProductSearchResult extends GeneralResult implements Serializable{
	
	private static final long serialVersionUID = 2084515502712398886L;
	
	private List<ProductSearch> searchList;

	public List<ProductSearch> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<ProductSearch> searchList) {
		this.searchList = searchList;
	}
	
	
}
