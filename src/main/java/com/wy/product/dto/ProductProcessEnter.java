package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/1/27.
 */
public class ProductProcessEnter  extends GeneralEnter implements Serializable {

    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
