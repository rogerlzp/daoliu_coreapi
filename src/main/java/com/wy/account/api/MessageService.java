package com.wy.account.api;

import java.util.List;

import com.wy.account.dto.Message;
import com.wy.account.dto.MessageEnter;
import com.wy.account.dto.MessageResult;
import com.wy.common.annotation.Role;

public interface MessageService {
	@Role
	public MessageResult getMessageByUser(MessageEnter messageEnter);
	@Role
	public MessageResult readMessages(MessageEnter messageEnter);
	
	public void insertMessage(Message message);
	public void insertMessageBatch(List<Message> messages);
}
