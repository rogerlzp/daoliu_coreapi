package com.wy.common.model;

import java.io.Serializable;

public class ResultData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1488813340934446735L;

	public static final String SUCCESS_RESULT_CODE = "0";

	protected String resultCode = SUCCESS_RESULT_CODE;

	protected String resultMessage;

	protected Object data;

	public ResultData() {
		super();
	}

	public ResultData(String resultCode) {
		super();
		this.resultCode = resultCode;
	}

	public ResultData(Object data) {
		this.data = data;
	}

	public ResultData(String resultCode, String resultMessage) {
		super();
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
	}

	public ResultData(String resultCode, String resultMessage, Object data) {
		super();
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
		this.data = data;
	}

	public ResultData(String resultCode, Object data) {
		super();
		this.resultCode = resultCode;
		this.data = data;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
