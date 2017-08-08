package com.wy.banner.api;

import com.wy.banner.dto.*;
import com.wy.cloan.dto.CloanDetailEnter;
import com.wy.cloan.dto.CloanDetailResult;
import com.wy.product.dto.ProductCmsEnter;

/**
 * Created by zhengpingli on 2017/6/24.
 */
public interface BannerService {

    public BannerListResult homepageRecommend(BannerListEnter bannerListEnter);


    public BannerListResult findAllBanner(BannerListEnter bannerListEnter);

    /**
     * cms  保存/更新产品
     *
     * @param bannerCmsEnter
     * @return
     */
    public String saveBanner(BannerCmsEnter bannerCmsEnter);


    /**
     * cms  保存/更新产品
     *
     * @param bannerCmsEnter
     * @return
     */
    public String updateBanner(BannerCmsEnter bannerCmsEnter);

    /**
     * 获取产品详情
     * @param cloanDetailEnter
     * @return
     */
    public BannerDetailResult findBannerDetail(BannerDetailEnter bannerDetailEnter);
}
