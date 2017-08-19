package com.wy.cloan.dto;

import com.wy.banner.dto.BannerList;
import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/8/18.
 */

public class AdvertisementListResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359813058091823242L;

    private List<AdvertisementList> adList;

    public List<AdvertisementList> getAdList() {
        return adList;
    }

    public void setAdList(List<AdvertisementList> adList) {
        this.adList = adList;
    }
}
