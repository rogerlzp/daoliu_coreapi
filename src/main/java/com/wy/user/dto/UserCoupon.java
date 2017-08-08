package com.wy.user.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ciro on 2015/12/11.
 */
public class UserCoupon implements Serializable {

	private static final long serialVersionUID = -5131221366466083729L;
	private Integer id;
	private String cashbackCouponId;
	private long userId;
	private String status;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;// 创建时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date invalidDate;// 创建时间
	private String activityType;// 创建时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCashbackCouponId() {
		return cashbackCouponId;
	}

	public void setCashbackCouponId(String cashbackCouponId) {
		this.cashbackCouponId = cashbackCouponId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
}
