package com.wy.market.dto;

import com.wy.common.model.GeneralEnter;

/**
 * Created by znz on 2016/2/2.
 */
public class LuckDrawEnter extends GeneralEnter {
    private static final long serialVersionUID = 945528119961056808L;
    private String mobileNo;
    private String seriorNo;//抽奖配置顺序号

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSeriorNo() {
        return seriorNo;
    }

    public void setSeriorNo(String seriorNo) {
        this.seriorNo = seriorNo;
    }
}
