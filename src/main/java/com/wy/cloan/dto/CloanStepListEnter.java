package com.wy.cloan.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/26.
 */

public class CloanStepListEnter extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 3525761201823456108L;

    private String cloanNo;

    public String getCloanNo() {
        return cloanNo;
    }

    public void setCloanNo(String cloanNo) {
        this.cloanNo = cloanNo;
    }

}
