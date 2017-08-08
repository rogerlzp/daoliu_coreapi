package com.wy.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyw on 2015/12/29.
 */
public class ProductSearchResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = -1757755437242833437L;
    private double usableBalance;// 可用余额
    private String lastTotal;
    private List<BalanceDetail> balanceDetails;//余额明细

    public double getUsableBalance() {
        return usableBalance;
    }

    public void setUsableBalance(double usableBalance) {
        this.usableBalance = usableBalance;
    }

    public List<BalanceDetail> getBalanceDetails() {
        return balanceDetails;
    }

    public void setBalanceDetails(List<BalanceDetail> balanceDetails) {
        this.balanceDetails = balanceDetails;
    }

	public String getLastTotal() {
		return lastTotal;
	}

	public void setLastTotal(String lastTotal) {
		this.lastTotal = lastTotal;
	}
}
