package com.wy.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: PasswordResult
 * 
 * @Description: return result that update password
 * @author Ciro
 * @date 2015-11-25
 */

public class ProductResult extends GeneralResult implements Serializable {

	private static final long serialVersionUID = -5869421800564726565L;

	private List<Product> productList;
	private List<Banner> bannersList;
	private String dtUrl;// 砸金蛋url

	private boolean isAllowShown;
	private boolean isHasShown;

	public String getDtUrl() {
		return dtUrl;
	}

	public void setDtUrl(String dtUrl) {
		this.dtUrl = dtUrl;
	}

	public List<Banner> getBannersList() {
		return bannersList;
	}

	public void setBannersList(List<Banner> bannersList) {
		this.bannersList = bannersList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public boolean isIsAllowShown() {
		return isAllowShown;
	}

	public void setIsAllowShown(boolean isAllowShown) {
		this.isAllowShown = isAllowShown;
	}

	public boolean isIsHasShown() {
		return isHasShown;
	}

	public void setIsHasShown(boolean isHasShown) {
		this.isHasShown = isHasShown;
	}

}
