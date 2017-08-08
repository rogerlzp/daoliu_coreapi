package com.wy.pc.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/2/29.
 */
public class FixedProductOrderInfoResult extends GeneralResult implements Serializable{
    private static final long serialVersionUID = -6319548488027854423L;
    private List<FixedProductOrderInfo> fixedProductOrderInfoList;
    public List<FixedProductOrderInfo> getFixedProductOrderInfoList() {
        return fixedProductOrderInfoList;
    }

    public void setFixedProductOrderInfoList(List<FixedProductOrderInfo> fixedProductOrderInfoList) {
        this.fixedProductOrderInfoList = fixedProductOrderInfoList;
    }
}
