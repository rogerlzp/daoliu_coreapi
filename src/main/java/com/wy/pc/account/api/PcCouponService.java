package com.wy.pc.account.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.pc.account.dto.PcCouponResult;

/**
 * Created by znz on 2016/3/2.
 */
public interface PcCouponService {
    @Role
    PcCouponResult getCouponList(GeneralEnter generalEnter);
}
