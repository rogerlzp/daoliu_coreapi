package com.wy.product.api;

import com.wy.common.annotation.Role;
import com.wy.product.dto.ProductSearchEnter;
import com.wy.product.dto.ProductSearchResult;

/**
 * Created by liuyw on 2015/12/29.
 */
public interface ProductSearchService {

    /**
     * 余额明细
     * @param productSearchEnter
     * @return
     */
    @Role
    public ProductSearchResult balanceDetail(ProductSearchEnter productSearchEnter);
}
