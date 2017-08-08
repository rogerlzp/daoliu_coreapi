package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/3/28.
 */
public class UserLocationEnter extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 9012139343423923027L;

    private long id;

    private Double latitude;

    private Double longitude;

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

    private long userId;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
