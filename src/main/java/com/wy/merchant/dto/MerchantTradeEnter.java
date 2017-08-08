package com.wy.merchant.dto;

import com.wy.gateway.dto.UmPayTradeEnter;

/**
 * 
 * Created by zhanggt on 2015-12-30.
 * 
 */
public class MerchantTradeEnter extends UmPayTradeEnter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4135891315732883137L;

	private String mer_id;

	private Long product_id;

	private String product_ids;

	private String mer_name;

	private double com_amt;

	public String getMer_id() {
		return mer_id;
	}

	public void setMer_id(String mer_id) {
		this.mer_id = mer_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_ids() {
		return product_ids;
	}

	public void setProduct_ids(String product_ids) {
		this.product_ids = product_ids;
	}

	public String getMer_name() {
		return mer_name;
	}

	public void setMer_name(String mer_name) {
		this.mer_name = mer_name;
	}

	public double getCom_amt() {
		return com_amt;
	}

	public void setCom_amt(double com_amt) {
		this.com_amt = com_amt;
	}

}
