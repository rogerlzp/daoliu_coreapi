package com.wy.user.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;
/**
 * Created by zhangnz on 2015/12/28.
 */
public class VersionInfoEnter extends GeneralEnter implements Serializable {
	private static final long serialVersionUID = 4979005210213686240L;
	private String appVersion;//版本号
	//private String clientType;
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

//	public String getClientType() {
//		return clientType;
//	}
//
//	public void setClientType(String clientType) {
//		this.clientType = clientType;
//	}
}
