package com.wy.baccount.dto;

import com.wy.common.model.GeneralEnter;

import java.util.ArrayList;
import java.util.List;

public class MessageEnter extends GeneralEnter {
	private static final long serialVersionUID = 7025793089255596221L;
	private long userId;
	private String id;
	private String type;//0 标记全部消息，1标记部分消息
	private List<String> ids = new ArrayList<String>();
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getIds() {
		return ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
