package com.wy.banner.dto;

import com.wy.common.model.GeneralResult;
import com.wy.product.dto.ProductList;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/24.
 */
public class BannerListResult  extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359813058148357242L;

    private List<BannerList> bannerList;

    public List<BannerList> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<BannerList> bannerList) {
        this.bannerList = bannerList;
    }
}
