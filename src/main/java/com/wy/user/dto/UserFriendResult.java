package com.wy.user.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class UserFriendResult extends GeneralResult implements Serializable{


	private static final long serialVersionUID = -8373083713761214539L;
	private Friends friends;
	private Friendss friendss;
	private List<UserFriendPage> userFriendlist;
	
	public Friends getFriends() {
		return friends;
	}
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	public Friendss getFriendss() {
		return friendss;
	}
	public void setFriendss(Friendss friendss) {
		this.friendss = friendss;
	}
	public List<UserFriendPage> getUserFriendlist() {
		return userFriendlist;
	}
	public void setUserFriendlist(List<UserFriendPage> userFriendlist) {
		this.userFriendlist = userFriendlist;
	}
}
