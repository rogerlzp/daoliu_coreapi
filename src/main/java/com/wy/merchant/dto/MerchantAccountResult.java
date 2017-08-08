package com.wy.merchant.dto;

import com.wy.gateway.dto.UmPayTradeResult;

import java.util.Map;

/**
 * Created by znz on 2016/1/8.
 */
public class MerchantAccountResult extends UmPayTradeResult {
    private Map resMap;

    public Map getResMap() {
        return resMap;
    }

    public void setResMap(Map resMap) {
        this.resMap = resMap;
    }
}
