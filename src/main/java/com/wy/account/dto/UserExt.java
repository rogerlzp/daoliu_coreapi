package com.wy.account.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/*
 * 用户扩展信息
 */
public class UserExt implements Serializable {
	private static final long serialVersionUID = -7321881790792899625L;
	private Integer id;//编号
	private Integer userId;//用户编号
	private String channel;//用户来源渠道
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;//创建日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
