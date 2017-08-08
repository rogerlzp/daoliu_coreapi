package com.wy.market.dto;

import com.wy.common.model.GeneralResult;

/**
 * Created by znz on 2016/2/2.
 */
public class LuckDrawResult extends GeneralResult {
    private static final long serialVersionUID = -1599635999305258815L;
    private String seriorNo;//抽奖配置顺序号

    private String awardName;//奖品名称

    private Integer awardType;//奖品类型

    private Integer isReceived;//是否发放
    public String getSeriorNo() {
        return seriorNo;
    }

    public void setSeriorNo(String seriorNo) {
        this.seriorNo = seriorNo;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public Integer getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Integer isReceived) {
        this.isReceived = isReceived;
    }
}
