package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/11/24.
 */
public class RegisterResult extends GeneralResult implements Serializable {


    private static final long serialVersionUID = 1620966942868460193L;
    private String pictureCode;
    private String sessionKey;

    private String plain;
    private String url;
    private String sign;

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

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }
}
