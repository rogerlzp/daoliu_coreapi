package com.wy.cloan.dto;

import com.wy.common.model.GeneralResult;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/8/18.
 */
@Data
public class AdvertisementResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359812301239123132L;

    private int id;
    private String name;
    private String imageUrl;
    private String linkUrl;
    private String status;
    private int isShowAd;
}
