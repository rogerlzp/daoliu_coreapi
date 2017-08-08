package com.wy.product.api;

import com.wy.common.annotation.Role;
import com.wy.product.dto.OrderEnter;
import com.wy.product.dto.OrderResult;

/**
 *
 *Created by zhanggt on 2016-2-20.
 *
 */
public interface NoPwdOrderService {

	
	@Role
	public OrderResult buyConfirm(OrderEnter orderEnter);
}
