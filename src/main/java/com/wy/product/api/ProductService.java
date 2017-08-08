package com.wy.product.api;

import java.util.List;

import com.wy.gateway.dto.UmPayProductResult;
import com.wy.product.dto.Product;
import com.wy.product.dto.ProductCmsEnter;
import com.wy.product.dto.ProductDetailEnter;
import com.wy.product.dto.ProductDetailResult;
import com.wy.product.dto.ProductEnter;
import com.wy.product.dto.ProductList;
import com.wy.product.dto.ProductListEnter;
import com.wy.product.dto.ProductListResult;
import com.wy.product.dto.ProductResult;
import com.wy.product.dto.PurchaseHistoryResult;

/**
 * 产品
 * Created by liuyw on 2015/12/2.
 */
public interface ProductService {

    /**
     * 查询所有的产品
     * @param productEnter
     * @return
     */
    public ProductResult allProductList(ProductEnter productEnter);


    /**
     * 首页内容
     * @param productEnter  推荐产品列表，banners列表
     * @return
     */
    public ProductResult homepageRecommend(ProductEnter productEnter);


    /**
     * 购买记录
     * @return
     */
    public PurchaseHistoryResult orderPurchaseHistory(ProductEnter productEnter);

    /**
     * 标的发布
     */
    public UmPayProductResult productPublish(ProductEnter productEnter);
    /**
     * 标的状态更新
     */
    public UmPayProductResult productStatusUpdate(ProductEnter productEnter);
    /**
     * cms  保存/更新产品
     * @param productCmsEnter
     * @return
     */
    public String saveProduct(ProductCmsEnter productCmsEnter);
    /**
     * 更新产品(草稿,不掉联动接口)
     * @param productCmsEnter
     * @return
     */
    public int updateProductWithOutUm(ProductCmsEnter productCmsEnter);
    /**
     * 获取产品详情
     * @param productDetailEnter
     * @return
     */
    public ProductDetailResult findProductDetail(ProductDetailEnter productDetailEnter);

    /**
     * 获取产品列表
     * @param productListEnter
     * @return
     */
    public ProductListResult findProductList(ProductListEnter productListEnter);
    /**
     *
     * @Description: 通过产品编号获取产品
     * @param @param productId
     * @param @return
     * @return Product
     * @throws
     * @author Ciro
     * @date 2015年12月26日
     */
    public Product getProductByProductId(Integer productId);
    /**
     * 查询所有的产品
     * @param productEnter
     * @return
     */
    public ProductListResult findProductListPage(ProductEnter productEnter);
    
    
}
