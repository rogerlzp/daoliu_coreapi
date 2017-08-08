package com.wy.system.dto;

import com.wy.common.model.GeneralResult;

/**
 * Created by zhengpingli on 2017/7/18.
 */
public class IOSApiResult extends GeneralResult {

    private String iosStatus;

    public String getIosStatus() {
        return iosStatus;
    }

    public void setIosStatus(String iosStatus) {
        this.iosStatus = iosStatus;
    }
}
