package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.wy.common.model.GeneralResult;

/**
 * Created by zhangnz on 2015/12/28.
 */
public class VersionInfoResult extends GeneralResult implements Serializable {
	private static final long serialVersionUID = 2298395082868904306L;
	private int id;
	private String downloadUrl;// 下载地址
	private String versionNo;// 新版本号
	private String updateInfo;// 提示文字 
	
	private int hasUpdate;// 是否更新
	private int forceUpdate;// 是否强制
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getUpdateInfo() {
		return updateInfo;
	}

	public void setUpdateInfo(String updateInfo) {
		this.updateInfo = updateInfo;
	}

	public int getHasUpdate() {
		return hasUpdate;
	}

	public void setHasUpdate(int hasUpdate) {
		this.hasUpdate = hasUpdate;
	}

	public int getForceUpdate() {
		return forceUpdate;
	}

	public void setForceUpdate(int forceUpdate) {
		this.forceUpdate = forceUpdate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
