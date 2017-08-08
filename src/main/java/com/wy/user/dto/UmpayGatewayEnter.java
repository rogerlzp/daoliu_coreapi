package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by liuyw on 2015/12/17.
 */
public class UmpayGatewayEnter extends GeneralEnter implements Serializable {


	private static final long serialVersionUID = 716502941643988648L;
	private String metaHtml;// 联动传过来的全部数据

	private String ret_code;
	private String mer_date;
	private String mer_id;
	private String sign_type;
	private String ret_msg;
	private String service;
	private String charset;
	private String user_id;
	private String order_id;
	private String version;
	private String sign;
	private String user_bind_agreement_list;
	private boolean sync;// 同步还是异步 默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false

	// 充值返回参数
	private String trade_no;
	private String com_amt_type;
	private String mer_check_date;
	private String balance;
	private String com_amt;
	// 提现
	private int amount;// 金额

	// 实名
	private String account_id;//
	private String contact_mobile;
	private String enroll_date;
	private String mer_cust_id;
	
	public String getMer_cust_id() {
		return mer_cust_id;
	}

	public void setMer_cust_id(String mer_cust_id) {
		this.mer_cust_id = mer_cust_id;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getContact_mobile() {
		return contact_mobile;
	}

	public void setContact_mobile(String contact_mobile) {
		this.contact_mobile = contact_mobile;
	}

	public String getEnroll_date() {
		return enroll_date;
	}

	public void setEnroll_date(String enroll_date) {
		this.enroll_date = enroll_date;
	}

	private Map requestMap;
	private Map responseMap;

	public Map getRequestMap() {
		return requestMap;
	}

	public void setRequestMap(Map requestMap) {
		this.requestMap = requestMap;
	}

	public Map getResponseMap() {
		return responseMap;
	}

	public void setResponseMap(Map responseMap) {
		this.responseMap = responseMap;
	}

	public String getUser_bind_agreement_list() {
		return user_bind_agreement_list;
	}

	public void setUser_bind_agreement_list(String user_bind_agreement_list) {
		this.user_bind_agreement_list = user_bind_agreement_list;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getCom_amt_type() {
		return com_amt_type;
	}

	public void setCom_amt_type(String com_amt_type) {
		this.com_amt_type = com_amt_type;
	}

	public String getMer_check_date() {
		return mer_check_date;
	}

	public void setMer_check_date(String mer_check_date) {
		this.mer_check_date = mer_check_date;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCom_amt() {
		return com_amt;
	}

	public void setCom_amt(String com_amt) {
		this.com_amt = com_amt;
	}

	public boolean isSync() {
		return sync;
	}

	public void setSync(boolean sync) {
		this.sync = sync;
	}

	public String getRet_code() {
		return ret_code;
	}

	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}

	public String getMer_date() {
		return mer_date;
	}

	public void setMer_date(String mer_date) {
		this.mer_date = mer_date;
	}

	public String getMer_id() {
		return mer_id;
	}

	public void setMer_id(String mer_id) {
		this.mer_id = mer_id;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getRet_msg() {
		return ret_msg;
	}

	public void setRet_msg(String ret_msg) {
		this.ret_msg = ret_msg;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public void setVersion(String version) {
		this.version = version;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getMetaHtml() {
		return metaHtml;
	}

	public void setMetaHtml(String metaHtml) {
		this.metaHtml = metaHtml;
	}

	@Override
	public String toString() {
		return "UmpayGatewayEnter{" +
				"metaHtml='" + metaHtml + '\'' +
				", ret_code='" + ret_code + '\'' +
				", mer_date='" + mer_date + '\'' +
				", mer_id='" + mer_id + '\'' +
				", sign_type='" + sign_type + '\'' +
				", ret_msg='" + ret_msg + '\'' +
				", service='" + service + '\'' +
				", charset='" + charset + '\'' +
				", user_id='" + user_id + '\'' +
				", order_id='" + order_id + '\'' +
				", version='" + version + '\'' +
				", sign='" + sign + '\'' +
				", sync=" + sync +
				", trade_no='" + trade_no + '\'' +
				", com_amt_type='" + com_amt_type + '\'' +
				", mer_check_date='" + mer_check_date + '\'' +
				", balance='" + balance + '\'' +
				", com_amt='" + com_amt + '\'' +
				", amount=" + amount +
				'}';
	}
}
