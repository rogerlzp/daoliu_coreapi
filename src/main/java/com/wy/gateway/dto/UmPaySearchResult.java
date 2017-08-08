package com.wy.gateway.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/23.
 */
public class UmPaySearchResult  extends GeneralResult implements Serializable {


    private static final long serialVersionUID = 8829252170713625780L;
    private String project_id;//商户端标的号
    private String project_account_id;//标的账户号
    private String project_account_state;//标的账户状态
    private String project_state;//标的账户状态
    private String balance;//标的余额
    private String plat_user_id;//资金账户托管平台用户号
    private String account_id;//资金账户托管平台的账户号
    private String cust_name;//姓名
    private String identity_type;//证件类型
    private String identity_code;//证件号
    private String contact_mobile;//手机
    private String mail_addr;//邮箱
    private String account_state;//账户状态
    private String card_id;//提现银行卡
    private String gate_id;//发卡银行编号
    private String user_bind_agreement_list;//用户签约约的协议列表信息

    private String order_id;
    private String mer_date;
    private String tran_state;

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

    public String getTran_state() {
        return tran_state;
    }

    public void setTran_state(String tran_state) {
        this.tran_state = tran_state;
    }

    public String getPlat_user_id() {
        return plat_user_id;
    }

    public void setPlat_user_id(String plat_user_id) {
        this.plat_user_id = plat_user_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
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

    public String getContact_mobile() {
        return contact_mobile;
    }

    public void setContact_mobile(String contact_mobile) {
        this.contact_mobile = contact_mobile;
    }

    public String getMail_addr() {
        return mail_addr;
    }

    public void setMail_addr(String mail_addr) {
        this.mail_addr = mail_addr;
    }

    public String getAccount_state() {
        return account_state;
    }

    public void setAccount_state(String account_state) {
        this.account_state = account_state;
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

    public String getUser_bind_agreement_list() {
        return user_bind_agreement_list;
    }

    public void setUser_bind_agreement_list(String user_bind_agreement_list) {
        this.user_bind_agreement_list = user_bind_agreement_list;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_account_id() {
        return project_account_id;
    }

    public void setProject_account_id(String project_account_id) {
        this.project_account_id = project_account_id;
    }

    public String getProject_account_state() {
        return project_account_state;
    }

    public void setProject_account_state(String project_account_state) {
        this.project_account_state = project_account_state;
    }

    public String getProject_state() {
        return project_state;
    }

    public void setProject_state(String project_state) {
        this.project_state = project_state;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
