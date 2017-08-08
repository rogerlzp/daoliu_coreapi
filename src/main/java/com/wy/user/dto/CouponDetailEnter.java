package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/1/3.
 */
public class CouponDetailEnter extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = 4012612759998243996L;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
