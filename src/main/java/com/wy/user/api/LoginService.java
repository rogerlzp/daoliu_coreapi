package com.wy.user.api;


import com.wy.common.annotation.Role;
import com.wy.user.dto.UserQueryEnter;
import com.wy.user.dto.UserQueryResult;


/**
 * Created by liuyw on 2015/11/11.
 */
public interface LoginService {

    /**
     * 登录
     * @param para
     * @return
     */
    UserQueryResult doLogin(UserQueryEnter para);


    /**
     * 退出
     * @param para
     * @return
     */
    @Role
    UserQueryResult doLogout(UserQueryEnter para);

}
