package com.wy.gateway.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/14.
 */
public class UmPayTradeEnter  extends GeneralEnter implements Serializable {


    private static final long serialVersionUID = 8271664119657714775L;
    private String order_id;//商户订单号
    private String mer_date;//商户订单日期
    private String pay_type;//支付方式 取值范围： B2CDEBITBANK（借记卡网银） B2BBANK（企业网银） DEBITCARD（借记卡快捷）[走这个是否必须在绑卡的时候签订快捷协议
    private String user_id;// 资金账户托管平台的用户号
    private String account_id;//资金账户托管平台的账户号
    private double amount;//资金账户托管平台的账户号
    private String gate_id;//发卡银行编号
    private String user_ip;//用户IP地址
    private String com_amt_type;//手续费承担方类型
    private String mer_account_id;//P2P平台的账户号
    private String partic_acc_type;//转账方类型
    private String trans_action;//转账方向
    private String partic_user_id;//转账方用户号
    private String partic_account_id;//转账方账户号
    private String mer_check_date;//资金账户托管平台对账日期
    private String trade_no;//交易平台流水号
    private String ret_code;//
    private String ret_msg;//
    private String metaHtml;//联动传过来的全部数据
    private String sourceV;//来源

    public String getSourceV() {
        return sourceV;
    }

    public void setSourceV(String sourceV) {
        this.sourceV = sourceV;
    }

    public String getMetaHtml() {
        return metaHtml;
    }

    public void setMetaHtml(String metaHtml) {
        this.metaHtml = metaHtml;
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

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getGate_id() {
        return gate_id;
    }

    public void setGate_id(String gate_id) {
        this.gate_id = gate_id;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }

    public String getCom_amt_type() {
        return com_amt_type;
    }

    public void setCom_amt_type(String com_amt_type) {
        this.com_amt_type = com_amt_type;
    }

    public String getMer_account_id() {
        return mer_account_id;
    }

    public void setMer_account_id(String mer_account_id) {
        this.mer_account_id = mer_account_id;
    }

    public String getPartic_acc_type() {
        return partic_acc_type;
    }

    public void setPartic_acc_type(String partic_acc_type) {
        this.partic_acc_type = partic_acc_type;
    }

    public String getTrans_action() {
        return trans_action;
    }

    public void setTrans_action(String trans_action) {
        this.trans_action = trans_action;
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

    public String getMer_check_date() {
        return mer_check_date;
    }

    public void setMer_check_date(String mer_check_date) {
        this.mer_check_date = mer_check_date;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
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
}
