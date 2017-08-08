package com.wy.pc.order.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

public class PcCurrentOrderResult extends GeneralResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8400374380137607349L;

	private String url;

	private String order_no;
	

	public PcCurrentOrderResult() {
		super("0");
	}

	public PcCurrentOrderResult(String code, String message, Integer totalCount) {
		super(code, message, totalCount);
	}

	public PcCurrentOrderResult(String code, String message) {
		super(code, message);
	}

	public PcCurrentOrderResult(String code) {
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
