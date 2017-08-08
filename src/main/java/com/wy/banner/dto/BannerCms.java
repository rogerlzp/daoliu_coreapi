package com.wy.banner.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/7/13.
 */

@Data
public class BannerCms implements Serializable {
    private static final long serialVersionUID = 4709082637402012698L;

    private int bannerId;
    private String bannerName;
    private String bannerUrl;
    private String linkUrl;
    private String bannerState;
}
