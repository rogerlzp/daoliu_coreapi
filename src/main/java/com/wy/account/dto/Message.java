package com.wy.account.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Message implements Serializable{
	private static final long serialVersionUID = 5022000822996199925L;
	private int id;//消息编号
	private long userId;//用户编号
	private String title;//消息标题
	private String shortName;//消息概要
	private String content;//消息内容
	private String type;//消息类型 0文本 1链接 2图文'  default '0'
	private String url;//消息链接
	private String showType;//消息展示方式 0消息中心 1推送 2均展示' default '0'
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;//消息创建时间
	private String createType;//消息创建方式 0系统触发 1消息推送 2手工发送' default '0'
	private String isRead;//是否已读：0未读 1已读' default '0'
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateType() {
		return createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
	
}