package com.wy.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class CurrentOrderResult extends GeneralResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400374380137607349L;

	private String url;

	private String order_no;
	

	public CurrentOrderResult() {
		super("0");
	}

	public CurrentOrderResult(String code, String message, Integer totalCount) {
		super(code, message, totalCount);
	}

	public CurrentOrderResult(String code, String message) {
		super(code, message);
	}

	public CurrentOrderResult(String code) {
		super(code);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

}
