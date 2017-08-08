package com.wy.currentProduct.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

/**
 * ClassName: CurrentProductResult
 * @author sm
 * @date 2016-1-21
 */

public class CurrentProductResult extends GeneralResult implements Serializable {

	 
	private static final long serialVersionUID = -7299455204104522887L;
	 
	private List<CurrentProduct> currentProductList;

	public List<CurrentProduct> getCurrentProductList() {
		return currentProductList;
	}

	public void setCurrentProductList(List<CurrentProduct> currentProductList) {
		this.currentProductList = currentProductList;
	}

	
	
}
