package com.wy.pc.product.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.pc.product.dto.FixedProductAccontInfoResult;
import com.wy.pc.product.dto.FixedProductOrderInfoResult;
import com.wy.user.dto.InvestmentEnter;

/**
 * Created by znz on 2016/2/29.
 */
public interface FixedProductAccountInfoService {
    @Role
    FixedProductAccontInfoResult homepage(GeneralEnter generalEnter);
    @Role
    FixedProductOrderInfoResult getOrderInfoList(InvestmentEnter investmentEnter);
}
