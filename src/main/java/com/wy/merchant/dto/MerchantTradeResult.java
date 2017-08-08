package com.wy.merchant.dto;

import com.wy.gateway.dto.UmPayTradeResult;

/**
 * 
 * Created by zhanggt on 2015-12-30.
 * 
 */
public class MerchantTradeResult extends UmPayTradeResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5711775936406297961L;

	private String order_no;

	public MerchantTradeResult() {
		super();
	}

	public MerchantTradeResult(String code) {
		super(code);
	}

	public MerchantTradeResult(String code, String message, Integer totalCount) {
		super(code, message, totalCount);
	}

	public MerchantTradeResult(String code, String message) {
		super(code, message);
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

}
