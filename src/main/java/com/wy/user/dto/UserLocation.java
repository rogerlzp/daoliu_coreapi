package com.wy.user.dto;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/3/29.
 */
public class UserLocation implements Serializable {

    private static final long serialVersionUID = 7209123939340233382L;

    private Double latitude;//经度
    private Double longitude;//纬度

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
