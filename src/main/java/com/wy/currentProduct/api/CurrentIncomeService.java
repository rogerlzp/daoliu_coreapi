package com.wy.currentProduct.api;

import com.wy.common.annotation.Role;
import com.wy.currentProduct.dto.CurrentIncomeListResult;
import com.wy.currentProduct.dto.CurrentProductEnter;

public interface CurrentIncomeService {
	/**
     * 查询活期收益流水
     * @param currProductCmsEnter
     * @return
     */
	@Role
    public CurrentIncomeListResult findCurrentIncomeList(CurrentProductEnter currentProductEnter);

}
