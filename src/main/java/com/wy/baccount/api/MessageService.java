package com.wy.baccount.api;

import com.wy.common.annotation.Role;
import com.wy.baccount.dto.Message;
import com.wy.baccount.dto.MessageEnter;
import com.wy.baccount.dto.MessageResult;

import java.util.List;

public interface MessageService {
	@Role
	public MessageResult getMessageByUser(MessageEnter messageEnter);
	@Role
	public MessageResult readMessages(MessageEnter messageEnter);
	
	public void insertMessage(Message message);
	public void insertMessageBatch(List<Message> messages);
}
