package com.wy.product.api;

import com.wy.common.annotation.Role;
import com.wy.product.dto.OfflineOrderResult;
import com.wy.user.dto.OfflineOrderEnter;

/**
 * 线下客户资料导入
 * Created by liuyw on 2016/2/19.
 */
public interface OfflineOrderService {

    @Role
    public OfflineOrderResult findOfflineOrder(OfflineOrderEnter orderEnter);


    /**
     * 导入接口数据
     * @param orderEnter
     * @return
     */
    public OfflineOrderResult importOfflineOrder(OfflineOrderEnter orderEnter);
}
