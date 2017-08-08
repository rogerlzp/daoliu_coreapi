package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.UserFriendEnter;
import com.wy.user.dto.UserFriendResult;

public interface UserFriendService {
	
	@Role
	public UserFriendResult queryUserFriend(UserFriendEnter userFriendEnter);
}
