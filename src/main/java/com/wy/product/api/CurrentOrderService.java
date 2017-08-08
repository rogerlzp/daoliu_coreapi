package com.wy.product.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.product.dto.CurrentOrderEnter;
import com.wy.product.dto.CurrentOrderResult;
import com.wy.product.dto.CurrentProductHomepageResult;

@Role
public interface CurrentOrderService {

	CurrentProductHomepageResult homepage(GeneralEnter generalEnter);

	CurrentOrderResult buy(CurrentOrderEnter currentOrderEnter);

	CurrentOrderResult extract(CurrentOrderEnter currentOrderEnter);

	void updatePayInfo(String order_no, String trade_no, String ret_msg, String ret_code);

}
