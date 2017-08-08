package com.wy.product.api;

import com.wy.product.dto.CurrentProcessEnter;
import com.wy.product.dto.CurrentProcessResult;
import com.wy.product.dto.ProductProcessEnter;
import com.wy.product.dto.ProductProcessResult;

public interface ProductProcessService {

	/**
	 * Spv还款
	 * @param productProcessEnter
	 * @return
     */
	ProductProcessResult remindSPVRepay(ProductProcessEnter productProcessEnter);

	/**
	 * 结标
	 * @param productProcessEnter
	 * @return
     */
	ProductProcessResult endProduct(ProductProcessEnter productProcessEnter);
}
