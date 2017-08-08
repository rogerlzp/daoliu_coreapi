package com.wy.gateway.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/23.
 */
public class UmPaySearchEnter extends GeneralEnter implements Serializable {
    private String project_id;//标的号

    private String user_id;//资金账户托管平台用户号
    private String is_find_account;//是否查询余额
    private String is_select_agreement;//	是否查询授权协议

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIs_find_account() {
        return is_find_account;
    }

    public void setIs_find_account(String is_find_account) {
        this.is_find_account = is_find_account;
    }

    public String getIs_select_agreement() {
        return is_select_agreement;
    }

    public void setIs_select_agreement(String is_select_agreement) {
        this.is_select_agreement = is_select_agreement;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }
}
