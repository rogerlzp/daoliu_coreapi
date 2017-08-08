package com.wy.pc.product.api;

import com.wy.common.annotation.Role;
import com.wy.pc.product.dto.PcOrderEnter;
import com.wy.pc.product.dto.PcOrderResult;

public interface PcOrderService {
	
	/**
	 * 下单准备，计算鸟币及返现券
	 */
	@Role
	PcOrderResult pcOrderPrepare(PcOrderEnter pcOrderEnter);
}
