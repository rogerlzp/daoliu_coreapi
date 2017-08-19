package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/8/18.
 */

@Data
public class AdvertisementCmsEnter implements Serializable {

    private static final long serialVersionUID = 1100123012341111769L;

    private String id;
    private String name;
    private String imageUrl;
    private String linkUrl;
    private String status;

}
