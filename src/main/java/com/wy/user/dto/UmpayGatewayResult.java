package com.wy.user.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/17.
 */
public class UmpayGatewayResult extends GeneralResult implements Serializable {


    private static final long serialVersionUID = 9084447305677778528L;
    private String mobilePayPlatform;//商户应给平台响应的数据：

    public String getMobilePayPlatform() {
        return mobilePayPlatform;
    }

    public void setMobilePayPlatform(String mobilePayPlatform) {
        this.mobilePayPlatform = mobilePayPlatform;
    }
}
