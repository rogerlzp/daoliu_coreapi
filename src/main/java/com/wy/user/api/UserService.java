package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.UserInfoListEnter;
import com.wy.user.dto.UserInfoListResult;

public interface UserService {
	
	UserInfoListResult findUserList(UserInfoListEnter userInfoListEnter);


}
