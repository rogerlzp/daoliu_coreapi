package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.PageResult;

public class UserInfoListResult extends PageResult implements Serializable {

	private static final long serialVersionUID = 5971456606926748755L;

	private List<UserInfoList> list;

	public List<UserInfoList> getList() {
		return list;
	}

	public void setList(List<UserInfoList> list) {
		this.list = list;
	}
}
