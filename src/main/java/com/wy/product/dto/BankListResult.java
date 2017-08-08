package com.wy.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/1/18.
 */
public class BankListResult extends GeneralResult implements Serializable {
	private static final long serialVersionUID = -3275595138243188985L;
	private List<BankInfo> list;
    private String bankIntroduction;//银行限制说明 add 2016-04-19

    public List<BankInfo> getList() {
        return list;
    }

    public void setList(List<BankInfo> list) {
        this.list = list;
    }

	public String getBankIntroduction() {
		return bankIntroduction;
	}

	public void setBankIntroduction(String bankIntroduction) {
		this.bankIntroduction = bankIntroduction;
	}
}
