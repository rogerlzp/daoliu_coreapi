package com.wy.cloan.api;

import com.wy.banner.dto.*;
import com.wy.cloan.dto.*;

/**
 * Created by zhengpingli on 2017/8/18.
 */
public interface AdvertisementService {

    public AdvertisementListResult findAllAd(AdvertisementListEnter advertisementListEnter);


    public AdvertisementResult findAd(AdvertisementEnter advertisementEnter);

    /**
     * cms  保存/更新产品
     *
     * @param advertisementCmsEnter
     * @return
     */
    public String saveAd(AdvertisementCmsEnter advertisementCmsEnter);


    /**
     * cms  保存/更新产品
     *
     * @param advertisementCmsEnter
     * @return
     */
    public String updateAd(AdvertisementCmsEnter advertisementCmsEnter);

    /**
     * 获取产品详情
     *
     * @param advertisementDetailEnter
     * @return
     */
    public AdvertisementDetailResult findADDetail(AdvertisementDetailEnter advertisementDetailEnter);
}
