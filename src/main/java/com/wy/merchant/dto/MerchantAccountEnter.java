package com.wy.merchant.dto;

import com.wy.gateway.dto.UmPayTradeEnter;

/**
 * Created by znz on 2016/1/8.
 */
public class MerchantAccountEnter extends UmPayTradeEnter {
    private String query_mer_id;//商户订单号
    private String account_type;//商户订单日期

    public String getQuery_mer_id() {
        return query_mer_id;
    }

    public void setQuery_mer_id(String query_mer_id) {
        this.query_mer_id = query_mer_id;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
}
