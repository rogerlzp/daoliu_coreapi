/**
 * 
 */
package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

/**
 * @author wangdejun
 *
 */
public class ExchangeCodeResult extends GeneralResult {
	private static final long serialVersionUID = 2514925396230220787L;
	private String detail;//返回详情
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
