package com.wy.banner.dto;

import java.io.Serializable;

/**
 * Created by liuyw on 2015/12/12.
 */
public class Banner implements Serializable {
    private static final long serialVersionUID = -4700536623079466698L;

    private int bannerId;
    private String bannerName;
    private String bannerUrl;
    private String linkUrl;
    private String bannerState;

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getBannerState() {
        return bannerState;
    }

    public void setBannerState(String bannerState) {
        this.bannerState = bannerState;
    }
}
