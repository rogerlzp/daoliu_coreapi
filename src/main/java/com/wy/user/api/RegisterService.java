package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.user.dto.RegisterEnter;
import com.wy.user.dto.RegisterResult;

/**
 * Created by liuyw on 2015/11/24.
 */
public interface RegisterService {

    /**
     * 获取验证码
     * @param para
     * @return
     */
    RegisterResult getPictureCode(RegisterEnter para);
    /**
     * 注册用户
     * @param para
     * @return
     */
    RegisterResult registerUser(RegisterEnter para);


    /**
     * 个人用户注册设置密码
     * @param para
     * @return
     */
    @Role
    RegisterResult register_person(RegisterEnter para);

    /**
     * 插入注册推荐人公司信息
     * @param dept
     */
    void insertReferrerDept(String dept,String mobileNo);
}
