package com.wy.account.dto;

import java.util.ArrayList;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class MessageResult extends GeneralResult {
	private static final long serialVersionUID = 2217462806591026623L;
	private int total;//消息总数
	private int unRead;//未读消息数
	private List<Message> messages = new ArrayList<Message>();//消息
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getUnRead() {
		return unRead;
	}
	public void setUnRead(int unRead) {
		this.unRead = unRead;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	

}
