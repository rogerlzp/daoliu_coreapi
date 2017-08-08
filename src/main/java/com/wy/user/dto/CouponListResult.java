package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

public class CouponListResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -5068280310003959613L;
	private List<CouponList> list;

	public List<CouponList> getList() {
		return list;
	}

	public void setList(List<CouponList> list) {
		this.list = list;
	}
	
}
