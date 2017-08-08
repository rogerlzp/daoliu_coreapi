package com.wy.gateway.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/15.
 */
public class UmPayProductEnter extends GeneralEnter implements Serializable {

	private static final long serialVersionUID = 2159947191130052560L;
	private String project_id;// 标的号
	private String change_type;// 标的更新类型
	private String project_state;// 标的状态
	private String project_name;// 标的名称
	private double project_amount;// 标的金额
	private String project_expire_date;// 标的有效期
	private String option_type;// 关系人操作类型
	private String loan_user_id;// 标的融资人资金账户托管平台用户号
	private String loan_account_id;// 资金账户托管平台的账户号
	private String loan_acc_type;// 借款方账户类型
	private String warranty_user_id;// 标的代偿方平台用户号
	private String warranty_account_id;// 资金账户托管平台的账户号
	private String receive_user_id;// 标的资金使用方平台用户号
	private String receive_account_id;// 资金账户托管平台的账户号
	private String receive_acc_type;// 资金使用方账户类型

	private String order_id;// 商户订单号
	private String mer_date;// 商户订单日期
	private String project_account_id;// 标的账户号
	private String serv_type;// 业务类型
	private String trans_action;// 转账方向
	private String partic_type;// 转账方类型
	private String partic_acc_type;// 转账方账户类型
	private String partic_user_id;// 转账方用户号（个人）或商户号（商户）
	private String partic_account_id;// 转账方账户号
	private String raise_end_date;// 募集结算时间
	private double amount;// 金额
	private double birdCoin;// 鸟币
	private String busi_type;//交易类型

	private String trade_no;// 平台返回流水号
	private String mer_check_date;// 资金账户托管平台对账日期
	private String ret_code;// 返回码
	private String ret_msg;// 返回信息

	private String metaHtml;// 联动传过来的全部数据
	private String sourceV;// 来源

	public String getSourceV() {
		return sourceV;
	}

	public void setSourceV(String sourceV) {
		this.sourceV = sourceV;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBirdCoin() {
		return birdCoin;
	}

	public void setBirdCoin(double birdCoin) {
		this.birdCoin = birdCoin;
	}

	public String getMetaHtml() {
		return metaHtml;
	}

	public void setMetaHtml(String metaHtml) {
		this.metaHtml = metaHtml;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getChange_type() {
		return change_type;
	}

	public void setChange_type(String change_type) {
		this.change_type = change_type;
	}

	public String getProject_state() {
		return project_state;
	}

	public void setProject_state(String project_state) {
		this.project_state = project_state;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public double getProject_amount() {
		return project_amount;
	}

	public void setProject_amount(double project_amount) {
		this.project_amount = project_amount;
	}

	public String getProject_expire_date() {
		return project_expire_date;
	}

	public void setProject_expire_date(String project_expire_date) {
		this.project_expire_date = project_expire_date;
	}

	public String getOption_type() {
		return option_type;
	}

	public void setOption_type(String option_type) {
		this.option_type = option_type;
	}

	public String getLoan_user_id() {
		return loan_user_id;
	}

	public void setLoan_user_id(String loan_user_id) {
		this.loan_user_id = loan_user_id;
	}

	public String getLoan_account_id() {
		return loan_account_id;
	}

	public void setLoan_account_id(String loan_account_id) {
		this.loan_account_id = loan_account_id;
	}

	public String getLoan_acc_type() {
		return loan_acc_type;
	}

	public void setLoan_acc_type(String loan_acc_type) {
		this.loan_acc_type = loan_acc_type;
	}

	public String getWarranty_user_id() {
		return warranty_user_id;
	}

	public void setWarranty_user_id(String warranty_user_id) {
		this.warranty_user_id = warranty_user_id;
	}

	public String getWarranty_account_id() {
		return warranty_account_id;
	}

	public void setWarranty_account_id(String warranty_account_id) {
		this.warranty_account_id = warranty_account_id;
	}

	public String getReceive_user_id() {
		return receive_user_id;
	}

	public void setReceive_user_id(String receive_user_id) {
		this.receive_user_id = receive_user_id;
	}

	public String getReceive_account_id() {
		return receive_account_id;
	}

	public void setReceive_account_id(String receive_account_id) {
		this.receive_account_id = receive_account_id;
	}

	public String getReceive_acc_type() {
		return receive_acc_type;
	}

	public void setReceive_acc_type(String receive_acc_type) {
		this.receive_acc_type = receive_acc_type;
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

	public String getProject_account_id() {
		return project_account_id;
	}

	public void setProject_account_id(String project_account_id) {
		this.project_account_id = project_account_id;
	}

	public String getServ_type() {
		return serv_type;
	}

	public void setServ_type(String serv_type) {
		this.serv_type = serv_type;
	}

	public String getTrans_action() {
		return trans_action;
	}

	public void setTrans_action(String trans_action) {
		this.trans_action = trans_action;
	}

	public String getPartic_type() {
		return partic_type;
	}

	public void setPartic_type(String partic_type) {
		this.partic_type = partic_type;
	}

	public String getPartic_acc_type() {
		return partic_acc_type;
	}

	public void setPartic_acc_type(String partic_acc_type) {
		this.partic_acc_type = partic_acc_type;
	}

	public String getPartic_user_id() {
		return partic_user_id;
	}

	public void setPartic_user_id(String partic_user_id) {
		this.partic_user_id = partic_user_id;
	}

	public String getPartic_account_id() {
		return partic_account_id;
	}

	public void setPartic_account_id(String partic_account_id) {
		this.partic_account_id = partic_account_id;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public String getMer_check_date() {
		return mer_check_date;
	}

	public void setMer_check_date(String mer_check_date) {
		this.mer_check_date = mer_check_date;
	}

	public String getRaise_end_date() {
		return raise_end_date;
	}

	public void setRaise_end_date(String raise_end_date) {
		this.raise_end_date = raise_end_date;
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
	
	public String getBusi_type() {
		return busi_type;
	}

	public void setBusi_type(String busi_type) {
		this.busi_type = busi_type;
	}

	@Override
	public String toString() {
		return "UmPayProductEnter [project_id=" + project_id + ", change_type=" + change_type + ", project_state=" + project_state
				+ ", project_name=" + project_name + ", project_amount=" + project_amount + ", project_expire_date=" + project_expire_date
				+ ", option_type=" + option_type + ", loan_user_id=" + loan_user_id + ", loan_account_id=" + loan_account_id
				+ ", loan_acc_type=" + loan_acc_type + ", warranty_user_id=" + warranty_user_id + ", warranty_account_id="
				+ warranty_account_id + ", receive_user_id=" + receive_user_id + ", receive_account_id=" + receive_account_id
				+ ", receive_acc_type=" + receive_acc_type + ", order_id=" + order_id + ", mer_date=" + mer_date + ", project_account_id="
				+ project_account_id + ", serv_type=" + serv_type + ", trans_action=" + trans_action + ", partic_type=" + partic_type
				+ ", partic_acc_type=" + partic_acc_type + ", partic_user_id=" + partic_user_id + ", partic_account_id="
				+ partic_account_id + ", raise_end_date=" + raise_end_date + ", amount=" + amount + ", birdCoin=" + birdCoin  
				+ ",busi_type" + busi_type
				+ ", trade_no=" + trade_no + ", mer_check_date=" + mer_check_date + ", ret_code=" + ret_code + ", ret_msg=" + ret_msg
				+ ", metaHtml=" + metaHtml + ", sourceV=" + sourceV + "]";
	}

}
