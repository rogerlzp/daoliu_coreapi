package com.wy.product.api;

import com.wy.product.dto.CurrentOrderEnter;
import com.wy.product.dto.CurrentOrderResult;
import com.wy.product.dto.CurrentProcessEnter;
import com.wy.product.dto.CurrentProcessResult;

public interface CurrentProcessService {

	/**
	 * 处理活期收益
	 * @param processEnter
	 * @return
     */
	CurrentProcessResult processCurrentInterest(CurrentProcessEnter processEnter);

	/**
	 * 处理活期提现
	 * @param processEnter
	 * @return
     */
	CurrentProcessResult processExtract(CurrentProcessEnter processEnter);
}
