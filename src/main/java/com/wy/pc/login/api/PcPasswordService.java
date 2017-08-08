package com.wy.pc.login.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.PasswordEnter;
import com.wy.user.dto.PasswordResult;

/**
 * Created by znz on 2016/2/26.
 */
public interface PcPasswordService {
    @Role
    public PasswordResult retrieveUserPwd(PasswordEnter pwe);
}
