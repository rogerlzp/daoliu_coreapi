package com.wy.product.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.ResultData;
import com.wy.gateway.dto.UmPayProductResult;
import com.wy.gateway.dto.UmpayTransferSearchResult;
import com.wy.product.dto.OrderEnter;
import com.wy.product.dto.OrderResult;

/**
 * 
 * 订单service Created by liuyw on 2015/12/11.
 */
public interface OrderService {

	/**
	 * 订单确认
	 * 
	 * @param orderEnter
	 * @return
	 */
	@Role
	public OrderResult buyConfirm(OrderEnter orderEnter);

	/**
	 * 下单准备，计算鸟币及返现券
	 */
	@Role
	OrderResult orderPrepare(OrderEnter orderEnter);

	void updateOrderPayInfo(String order_no, String trade_no, String ret_msg, String ret_code);

	public void orderTimeout(long productId, String orderId, double amount, double bird_coin, long user_coupon_id, String product_type,
			long userId, long accountId);

	/**
	 * 交易查询
	 * 
	 * @param OrderId
	 *            编号 (主键) ID
	 * @return
	 */
	public UmPayProductResult getOrderById(Long orderId);

	UmpayTransferSearchResult orderSearchFromUmpay(String order_no, String busi_type, String order_date);

	public void updateProjectStatusToOverBid(long productId, String productNo, double totalAmount, double remainAmount);

	public UmPayProductResult product_transfer_spv(String project_id, double amount);
	
	public ResultData product_withdrawals(String project_id, double amount);
}
