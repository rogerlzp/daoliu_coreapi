package com.wy.pc.account.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/2.
 */
public class PcWaterCourseEnter extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = 3118877471485570560L;
    private String operateType;

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
