package com.wy.common.model;

import java.io.Serializable;

/**
 * 普通的入参 基类
 */
public class GeneralEnter implements Serializable {
	private static final long serialVersionUID = -8015527491830557481L;
	/**
	 * 版本号
	 */
	private String version;
	/**
	 * 时间戳 格式:yyyymmddhh24MMss
	 */
	private String timestamp;
	/**
	 * 客户端类型
	 * PC：p
	 * app android:
	 * app ios:
	 */
	private String clientType;


	/**
	 * Session KEY
	 */
	private String sessionKey;

	private Integer pageSize=10;//每页记录数

	private Integer currentPage=0;//起始页码

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
}
