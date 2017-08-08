package com.wy.common.model;

import java.io.Serializable;

/**
 * 普通的出参
 *
 */
public class GeneralResult implements Serializable {
	private static final long serialVersionUID = -6024202655672249156L;
	private String code;
	private String message;

	public GeneralResult(String code) {
		super();
		this.code = code;
	}

	public GeneralResult(String code, String message, Integer totalCount) {
		super();
		this.code = code;
		this.message = message;
	}
	private Integer totalCount;//总条数

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public GeneralResult() {
	}

	public GeneralResult(String code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
