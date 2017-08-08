package com.wy.pc.product.api;

import com.wy.pc.product.dto.IndexCurrentProductEnter;
import com.wy.pc.product.dto.IndexCurrentProductResult;
import com.wy.pc.product.dto.IndexLongProductEnter;
import com.wy.pc.product.dto.IndexLongProductResult;
import com.wy.pc.product.dto.IndexShortProductEnter;
import com.wy.pc.product.dto.IndexShortProductResult;
import com.wy.pc.product.dto.NewProductEnter;
import com.wy.pc.product.dto.NewProductResult;
import com.wy.pc.product.dto.ProductDetailEnter;
import com.wy.pc.product.dto.SxtProductDetailResult;

public interface PcIndexProudctService {
	/**
	 * 获取首页中的新手标和体验标
	 * @param newProductEnter
	 * @return
	 */
	NewProductResult findNewProductList(NewProductEnter newProductEnter);
	
	/**
	 * 获取首页中的随心投
	 * @param indexCurrentProductEnter
	 * @return
	 */
	IndexCurrentProductResult findIndexCurrentProductList(IndexCurrentProductEnter indexCurrentProductEnter);

	/**
	 * 获取首页中的短期标-乐巢投
	 * @param indexShortProductEnter
	 * @return
	 */
	IndexShortProductResult findIndexShortProductList(IndexShortProductEnter indexShortProductEnter);
	
	/**
	 * 获取首页中的中长期-乐巢投系列
	 * @param indexLongProductEnter
	 * @return
	 */
	IndexLongProductResult findIndexLongProductList(IndexLongProductEnter indexLongProductEnter);

	/**
	 * 获取随心投产品详情
	 * @param productDetailEnter
	 * @return
	 */
	SxtProductDetailResult findSxtProductDetail(ProductDetailEnter productDetailEnter);
}
