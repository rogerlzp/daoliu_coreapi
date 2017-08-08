package com.wy.pc.order.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.pc.order.dto.PcCurrentOrderEnter;
import com.wy.pc.order.dto.PcCurrentOrderResult;
import com.wy.product.dto.CurrentProductHomepageResult;
/**
 * PC活期下单
 * @author yuge
 *
 */
@Role
public interface PcCurrentOrderService {

	/*CurrentProductHomepageResult homepage(GeneralEnter generalEnter);

	PcCurrentOrderResult buy(PcCurrentOrderEnter pcCurrentOrderEnter);

	PcCurrentOrderResult extract(PcCurrentOrderEnter pcCurrentOrderEnter);

	void updatePayInfo(String order_no, String trade_no, String ret_msg, String ret_code);
*/
}
