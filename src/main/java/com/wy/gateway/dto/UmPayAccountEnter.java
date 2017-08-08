package com.wy.gateway.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by liuyw on 2015/12/10.
 */
public class UmPayAccountEnter extends GeneralEnter implements Serializable {


	private static final long serialVersionUID = -4905355479740703867L;
	private String mer_cust_id;// 商户用户标识
	private String mer_cust_name;// 用户姓名
	private String identity_type;// 证件类型
	private String identity_code;// 证件号码
	private String mobile_id;// 手机号
	private String email;// 邮箱

	private String order_id;// 商户订单号
	private String mer_date;// 商户订单日期
	private String user_id;// 联动平台用户号
	private String card_id;// 银行卡号
	private String gate_id;// 银行简码
	private String account_name;// 开卡户名
	private String cnaps_code;// 联行号
	private String account_area;// 开卡地区
	private String card_branch_name;// 开户支行名称
	private String is_open_fastPayment;// 快捷协议标志

	private String trade_state;
	private String transfer_date;
	private String transfer_settle_date;

	private String metaHtml;// 联动传过来的全部数据
	private String sourceV;// 来源

	private String mer_id;
	private String sign_type;
	private String service;
	private String charset;
	private String version;
	private String sign;

	// 一般平台调用我们接口的时候会返回下面两个参数
	private String ret_code;// 交易结果
	private String ret_msg;// 返回信息

	private String last_four_cardid;// 卡号后四位
	private String user_bind_agreement_list;// 用户帮卡时同时绑定的协议列表信息

	private Map reqData;// 响应异步请求时候需要的业务参数
	private boolean sync;// 同步还是异步 默认设置下，所有请求均为异步请求。如果需要发送同步请求，请将此选项设置为 false

	private String trade_no;
	private String com_amt_type;
	private String mer_check_date;
	private String balance;
	private String com_amt;

	private String query_mer_id;//查询的商户号
	private String account_type;//查询的商户号

	private String ret_url;//页面跳转同步通知页面路径
	private String notify_url;//服务器异步通知页面路径

	// 提现
	private int amount;// 金额
	
	// 实名
	private String account_id;//
	private String contact_mobile;
	private String enroll_date;
	//private String mer_cust_id;
	//private String mer_id;
	//private String order_id;
	//private String ret_code;
	//private String ret_msg;
	//private String service;
	//private String sign_type;
	//private String user_id;
	//private String version;
	//private String sign;
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


	public String getQuery_mer_id() {
		return query_mer_id;
	}

	public void setQuery_mer_id(String query_mer_id) {
		this.query_mer_id = query_mer_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isSync() {
		return sync;
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

	public boolean getSync() {
		return sync;
	}

	public void setSync(boolean sync) {
		this.sync = sync;
	}

	public Map getReqData() {
		return reqData;
	}

	public void setReqData(Map reqData) {
		this.reqData = reqData;
	}

	public String getMer_cust_id() {
		return mer_cust_id;
	}

	public void setMer_cust_id(String mer_cust_id) {
		this.mer_cust_id = mer_cust_id;
	}

	public String getMer_cust_name() {
		return mer_cust_name;
	}

	public void setMer_cust_name(String mer_cust_name) {
		this.mer_cust_name = mer_cust_name;
	}

	public String getIdentity_type() {
		return identity_type;
	}

	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
	}

	public String getIdentity_code() {
		return identity_code;
	}

	public void setIdentity_code(String identity_code) {
		this.identity_code = identity_code;
	}

	public String getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(String mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getMer_date() {
		return mer_date;
	}

	public void setMer_date(String mer_date) {
		this.mer_date = mer_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	public String getGate_id() {
		return gate_id;
	}

	public void setGate_id(String gate_id) {
		this.gate_id = gate_id;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getCnaps_code() {
		return cnaps_code;
	}

	public void setCnaps_code(String cnaps_code) {
		this.cnaps_code = cnaps_code;
	}

	public String getAccount_area() {
		return account_area;
	}

	public void setAccount_area(String account_area) {
		this.account_area = account_area;
	}

	public String getCard_branch_name() {
		return card_branch_name;
	}

	public void setCard_branch_name(String card_branch_name) {
		this.card_branch_name = card_branch_name;
	}

	public String getIs_open_fastPayment() {
		return is_open_fastPayment;
	}

	public void setIs_open_fastPayment(String is_open_fastPayment) {
		this.is_open_fastPayment = is_open_fastPayment;
	}

	public String getMetaHtml() {
		return metaHtml;
	}

	public void setMetaHtml(String metaHtml) {
		this.metaHtml = metaHtml;
	}

	public String getSourceV() {
		return sourceV;
	}

	public void setSourceV(String sourceV) {
		this.sourceV = sourceV;
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

	public String getRet_code() {
		return ret_code;
	}

	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}

	public String getRet_msg() {
		return ret_msg;
	}

	public void setRet_msg(String ret_msg) {
		this.ret_msg = ret_msg;
	}

	public String getLast_four_cardid() {
		return last_four_cardid;
	}

	public void setLast_four_cardid(String last_four_cardid) {
		this.last_four_cardid = last_four_cardid;
	}

	public String getUser_bind_agreement_list() {
		return user_bind_agreement_list;
	}

	public void setUser_bind_agreement_list(String user_bind_agreement_list) {
		this.user_bind_agreement_list = user_bind_agreement_list;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	public String getTransfer_date() {
		return transfer_date;
	}

	public void setTransfer_date(String transfer_date) {
		this.transfer_date = transfer_date;
	}

	public String getTransfer_settle_date() {
		return transfer_settle_date;
	}

	public void setTransfer_settle_date(String transfer_settle_date) {
		this.transfer_settle_date = transfer_settle_date;
	}

	public String getRet_url() {
		return ret_url;
	}

	public void setRet_url(String ret_url) {
		this.ret_url = ret_url;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	@Override
	public String toString() {
		return "UmPayAccountEnter{" + "mer_cust_id='" + mer_cust_id + '\'' + ", mer_cust_name='" + mer_cust_name + '\''
				+ ", identity_type='" + identity_type + '\'' + ", identity_code='" + identity_code + '\'' + ", mobile_id='" + mobile_id
				+ '\'' + ", email='" + email + '\'' + ", order_id='" + order_id + '\'' + ", mer_date='" + mer_date + '\'' + ", user_id='"
				+ user_id + '\'' + ", card_id='" + card_id + '\'' + ", gate_id='" + gate_id + '\'' + ", account_name='" + account_name
				+ '\'' + ", cnaps_code='" + cnaps_code + '\'' + ", account_area='" + account_area + '\'' + ", card_branch_name='"
				+ card_branch_name + '\'' + ", is_open_fastPayment='" + is_open_fastPayment + '\'' + ", metaHtml='" + metaHtml + '\''
				+ ", sourceV='" + sourceV + '\'' + ", mer_id='" + mer_id + '\'' + ", sign_type='" + sign_type + '\'' + ", service='"
				+ service + '\'' + ", charset='" + charset + '\'' + ", version='" + version + '\'' + ", sign='" + sign + '\''
				+ ", ret_code='" + ret_code + '\'' + ", ret_msg='" + ret_msg + '\'' + ", last_four_cardid='" + last_four_cardid + '\''
				+ ", user_bind_agreement_list='" + user_bind_agreement_list + '\'' + '}';
	}
}
