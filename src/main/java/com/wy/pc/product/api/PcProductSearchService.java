package com.wy.pc.product.api;

import com.wy.pc.product.dto.ProductSearchEnter;
import com.wy.pc.product.dto.ProductSearchResult;

public interface PcProductSearchService {
	/**
	 * 理财页产品搜索
	 * @param productSearchEnter
	 * @return
	 */
	ProductSearchResult findProductSearch(ProductSearchEnter productSearchEnter);
}
