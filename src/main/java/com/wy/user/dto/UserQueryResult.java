package com.wy.user.dto;


import com.wy.common.model.GeneralResult;

import java.util.List;

public class UserQueryResult extends GeneralResult {

    private static final long serialVersionUID = -4074348732920836434L;

    private List<User> returnlist; // 查询返回列表

    private String sessionKey;//sessioney
    private String verifyCode;//验证码

    public void setReturnlist(List<User> returnlist) {
        this.returnlist = returnlist;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public List<User> getReturnlist() {
        return returnlist;
    }
}
