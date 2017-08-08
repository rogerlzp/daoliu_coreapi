package com.wy.pc.product.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.pc.product.dto.CurrentProductAccontInfoResult;
import com.wy.pc.product.dto.PcCurrentInOutDetailsEnter;
import com.wy.pc.product.dto.PcCurrentInOutDetailsResult;

/**
 * Created by znz on 2016/2/28.
 */
public interface CurrentProductAccountInfoService {
    @Role
    CurrentProductAccontInfoResult homepage(GeneralEnter generalEnter);
    
    @Role
    PcCurrentInOutDetailsResult currentInOutDetailsByUser(PcCurrentInOutDetailsEnter pcCurrentInOutDetailsEnter);
}
