package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/29.
 */
public class ProductSearchEnter  extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = 288114239397609403L;
    private String lastTotal;
	public String getLastTotal() {
		return lastTotal;
	}
	public void setLastTotal(String lastTotal) {
		this.lastTotal = lastTotal;
	}
}
