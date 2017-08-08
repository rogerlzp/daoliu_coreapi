package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

/**
 * @author wangdejun
 *
 */
public class ExchangeCodeEnter extends GeneralEnter {
	private static final long serialVersionUID = 8453546792188568274L;
	private String code;//兑换码

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
