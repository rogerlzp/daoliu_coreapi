package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/2/17.
 */
public class AgreementResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 4167798469732863701L;
    private String plain;
    private String url;
    private String sign;

    @Override
    public String toString() {
        return "AgreementResult{" +
                "plain='" + plain + '\'' +
                ", url='" + url + '\'' +
                ", sign='" + sign + '\'' +
                '}';
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
