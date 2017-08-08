package com.wy.cloan.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public class CloanUserListEnter extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 35257612761523108L;


    private String operationType;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}