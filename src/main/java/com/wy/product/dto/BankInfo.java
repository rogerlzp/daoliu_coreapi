package com.wy.product.dto;

import java.io.Serializable;

/**
 * Created by znz on 2016/1/18.
 */
public class BankInfo implements Serializable {
    private static final long serialVersionUID = -4638466592760791769L;
    private Integer id;//
    private String bankCode;//银行编号
    private String bankName;//银行名称
    private double chargeTimeLimit;//每次限额
    private double chargeDateLimit;//每日限额
    private String bankMessage;//银行说明 add 2016-04-19

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getChargeTimeLimit() {
        return chargeTimeLimit;
    }

    public void setChargeTimeLimit(double chargeTimeLimit) {
        this.chargeTimeLimit = chargeTimeLimit;
    }

    public double getChargeDateLimit() {
        return chargeDateLimit;
    }

    public void setChargeDateLimit(double chargeDateLimit) {
        this.chargeDateLimit = chargeDateLimit;
    }

	public String getBankMessage() {
		return bankMessage;
	}

	public void setBankMessage(String bankMessage) {
		this.bankMessage = bankMessage;
	}
}
