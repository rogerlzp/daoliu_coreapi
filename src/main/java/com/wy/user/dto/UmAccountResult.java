package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/11.
 */
public class UmAccountResult extends GeneralResult implements Serializable {


    private static final long serialVersionUID = -7322285781269509214L;
    private String plain;
    private String url;
    private String sign;
    private String is_jump;//是否跳转到网页支付 1 是，0：否，后台支付

    public String getIs_jump() {
        return is_jump;
    }

    public void setIs_jump(String is_jump) {
        this.is_jump = is_jump;
    }

    public String getPlain() {
        return plain;
    }

    public void setPlain(String plain) {
        this.plain = plain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
