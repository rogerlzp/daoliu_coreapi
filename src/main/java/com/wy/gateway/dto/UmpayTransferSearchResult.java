package com.wy.gateway.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralResult;

/**
 * 
 * Created by zhanggt on 2016-1-4.
 * 
 */
public class UmpayTransferSearchResult extends GeneralResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5620362691915692914L;

	private String order_id;
	private String mer_check_date;
	private String mer_date;
	private String trade_no;
	private String busi_type;
	private String amount;
	private String orig_amt;
	private String com_amt;
	private String com_amt_type;
	private String tran_state;
	private String sms_num;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getMer_check_date() {
		return mer_check_date;
	}

	public void setMer_check_date(String mer_check_date) {
		this.mer_check_date = mer_check_date;
	}

	public String getMer_date() {
		return mer_date;
	}

	public void setMer_date(String mer_date) {
		this.mer_date = mer_date;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getBusi_type() {
		return busi_type;
	}

	public void setBusi_type(String busi_type) {
		this.busi_type = busi_type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrig_amt() {
		return orig_amt;
	}

	public void setOrig_amt(String orig_amt) {
		this.orig_amt = orig_amt;
	}

	public String getCom_amt() {
		return com_amt;
	}

	public void setCom_amt(String com_amt) {
		this.com_amt = com_amt;
	}

	public String getCom_amt_type() {
		return com_amt_type;
	}

	public void setCom_amt_type(String com_amt_type) {
		this.com_amt_type = com_amt_type;
	}

	public String getTran_state() {
		return tran_state;
	}

	public void setTran_state(String tran_state) {
		this.tran_state = tran_state;
	}

	public String getSms_num() {
		return sms_num;
	}

	public void setSms_num(String sms_num) {
		this.sms_num = sms_num;
	}

	@Override
	public String toString() {
		return "UmpayTransferSearchResult [order_id=" + order_id + ", mer_check_date=" + mer_check_date + ", mer_date=" + mer_date
				+ ", trade_no=" + trade_no + ", busi_type=" + busi_type + ", amount=" + amount + ", orig_amt=" + orig_amt + ", com_amt="
				+ com_amt + ", com_amt_type=" + com_amt_type + ", tran_state=" + tran_state + ", sms_num=" + sms_num + "]";
	}

}
