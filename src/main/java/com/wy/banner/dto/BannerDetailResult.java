package com.wy.banner.dto;

import com.wy.common.model.GeneralResult;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/7/13.
 */
@Data
public class BannerDetailResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 9139763538521395307L;

    private int bannerId;
    private String bannerName;
    private String bannerUrl;
    private String linkUrl;
    private String bannerState;

}