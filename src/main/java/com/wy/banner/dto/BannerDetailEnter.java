package com.wy.banner.dto;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/7/13.
 */

public class BannerDetailEnter implements Serializable {

    private static final long serialVersionUID = 1129562730192343718L;

    private String bannerId;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }
}
