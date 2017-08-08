package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

public class UserFriendList implements Serializable{

	private static final long serialVersionUID = -671917606429717029L;
	
	private List<UserFriendPage> list;

	public List<UserFriendPage> getList() {
		return list;
	}

	public void setList(List<UserFriendPage> list) {
		this.list = list;
	}

}
