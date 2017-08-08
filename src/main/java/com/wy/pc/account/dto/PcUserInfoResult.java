package com.wy.pc.account.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;
import com.wy.user.dto.Account;
import com.wy.user.dto.Coupon;

public class PcUserInfoResult extends GeneralResult implements Serializable{

	private static final long serialVersionUID = 8076566034973962468L;
	
	private List<Coupon> coupons;
	
	private Account account;

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
