package com.wy.merchant.dto;

import com.wy.gateway.dto.UmPayTradeEnter;

/**
 * 
 * @author yg
 *
 */
public class MerchantProjectDetailEnter extends UmPayTradeEnter{

	private static final long serialVersionUID = 7537575135841914153L;
	
	private Integer productId;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
