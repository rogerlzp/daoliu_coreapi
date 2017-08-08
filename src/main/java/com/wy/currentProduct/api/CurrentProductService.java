package com.wy.currentProduct.api;

import com.wy.common.model.PageResultData;
import com.wy.currentProduct.dto.CurrentProductCmsEnter;
import com.wy.currentProduct.dto.CurrentProductEnter;
import com.wy.currentProduct.dto.CurrentProductResult;
import com.wy.gateway.dto.UmPayProductResult;


/**
 * 活期产品
 * Created by sm on 2016/1/21.
 */
public interface CurrentProductService {

	public PageResultData list(long currentPage, long pageSize, String status); 
	
	public CurrentProductResult findCurrProductById(CurrentProductEnter currProductEnter);
	
	/**
     * cms  查询有效活期产品
     * @param productCmsEnter
     * @return
     */
	public CurrentProductResult findCurrProduct(String status);
	
	 /**
     * cms  保存 
     * @param productCmsEnter
     * @return
     */
    public int saveCurrentProduct(CurrentProductCmsEnter currProductCmsEnter);
    
    public int updateCurrentProduct(CurrentProductCmsEnter currProductCmsEnter);
    /**
     * 更新产品(草稿,不掉联动接口)
     * @param productCmsEnter
     * @return
     */
    public int updateCurrProductWithOutUm(CurrentProductCmsEnter currProductCmsEnter,String productStauts);
    /**
     * 开标
     * @param currProductCmsEnter
     * @return
     */
    public int updateCurrentProductByKb(CurrentProductCmsEnter currProductCmsEnter);

    /**
     * 发布
     */
    public int updateCurrenProductByFb(CurrentProductCmsEnter currProductCmsEnter);
    
    public UmPayProductResult productPublish(CurrentProductEnter productEnter);
}
