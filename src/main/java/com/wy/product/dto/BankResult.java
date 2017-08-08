package com.wy.product.dto;

import com.wy.common.model.GeneralResult;
import com.wy.user.dto.Coupon;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyw on 2015/12/11.
 */
public class BankResult extends GeneralResult implements Serializable {
	private static final long serialVersionUID = -6846501452379456190L;
	private String onceLimit ;// 每次限制
	private String dailyLimit;//每日限制
	private String notice;//银行异常信息

	public String getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(String dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public String getOnceLimit() {
		return onceLimit;
	}

	public void setOnceLimit(String onceLimit) {
		this.onceLimit = onceLimit;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}
}
