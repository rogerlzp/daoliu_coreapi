package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyw on 2016/2/19.
 */
public class OfflineOrderEnter extends GeneralEnter implements Serializable {


    private static final long serialVersionUID = -4249259505501853914L;
    private String orderType;

    private List<OfflineOrder> offlineOrders;

    public List<OfflineOrder> getOfflineOrders() {
        return offlineOrders;
    }

    public void setOfflineOrders(List<OfflineOrder> offlineOrders) {
        this.offlineOrders = offlineOrders;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
