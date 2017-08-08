package com.wy.product.dto;

import com.wy.common.model.GeneralResult;
import com.wy.user.dto.OfflineOrder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyw on 2016/2/19.
 */
public class OfflineOrderResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 1902625247790956473L;
    private List<OfflineOrder> offlineOrderList;

    public List<OfflineOrder> getOfflineOrderList() {
        return offlineOrderList;
    }

    public void setOfflineOrderList(List<OfflineOrder> offlineOrderList) {
        this.offlineOrderList = offlineOrderList;
    }
}
