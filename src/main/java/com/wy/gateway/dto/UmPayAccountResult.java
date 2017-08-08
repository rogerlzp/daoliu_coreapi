package com.wy.gateway.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by liuyw on 2015/12/10.
 */
public class UmPayAccountResult extends GeneralResult implements Serializable {


    private static final long serialVersionUID = 998165597870137108L;
    private String reg_date;
    private String user_id;
    private String account_id;
    private String plain;
    private String url;
    private String sign;
    private Map resData;
    private String mobilePayPlatform;//商户应给平台响应的数据：


    private String balance;//账户余额
    private String account_type;//被充值企业资金账户托管平台的账户类型
    private String account_state;//账户状态
    private String query_mer_id;//查询的商户号

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_state() {
        return account_state;
    }

    public void setAccount_state(String account_state) {
        this.account_state = account_state;
    }

    public String getQuery_mer_id() {
        return query_mer_id;
    }

    public void setQuery_mer_id(String query_mer_id) {
        this.query_mer_id = query_mer_id;
    }

    public String getMobilePayPlatform() {
        return mobilePayPlatform;
    }

    public void setMobilePayPlatform(String mobilePayPlatform) {
        this.mobilePayPlatform = mobilePayPlatform;
    }

    public Map getResData() {
        return resData;
    }

    public void setResData(Map resData) {
        this.resData = resData;
    }

    public String getPlain() {
        return plain;
    }

    public void setPlain(String plain) {
        this.plain = plain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
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
}
