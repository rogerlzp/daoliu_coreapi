package com.wy.gateway.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/4/11.
 */
public class QiNiuTokenResult extends GeneralResult implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1019394959920234422L;


    private String uploadToken;

    public String getUploadToken() {
        return uploadToken;
    }

    public void setUploadToken(String uploadToken) {
        this.uploadToken = uploadToken;
    }


}
