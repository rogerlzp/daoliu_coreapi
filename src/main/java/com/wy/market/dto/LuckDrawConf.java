package com.wy.market.dto;

import com.wy.common.model.GeneralResult;

/**
 * Created by znz on 2016/2/2.
 */
public class LuckDrawConf{

    private String seriorNo;//抽奖配置顺序号

    private Integer awardType;//奖品类型

    private String awardPic;//奖品图片

    private String awardName;//奖品名称

    private Double awardAmount;//金额

    private Double awardRate;//中奖几率

    private Double awardSecondRate;//二次中奖几率

    private String couponId;//优惠券ID

    private String awardStoreIds;//领奖方式

    private String awardAddr;//领奖地址

    private Integer numberDay;//每次限额

    private Integer numberTotal;//总限额

    private Integer state;//奖品状态

    public String getSeriorNo() {
        return seriorNo;
    }

    public void setSeriorNo(String seriorNo) {
        this.seriorNo = seriorNo;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardPic() {
        return awardPic;
    }

    public void setAwardPic(String awardPic) {
        this.awardPic = awardPic;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public Double getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(Double awardAmount) {
        this.awardAmount = awardAmount;
    }

    public Double getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(Double awardRate) {
        this.awardRate = awardRate;
    }

    public Double getAwardSecondRate() {
        return awardSecondRate;
    }

    public void setAwardSecondRate(Double awardSecondRate) {
        this.awardSecondRate = awardSecondRate;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getAwardStoreIds() {
        return awardStoreIds;
    }

    public void setAwardStoreIds(String awardStoreIds) {
        this.awardStoreIds = awardStoreIds;
    }

    public String getAwardAddr() {
        return awardAddr;
    }

    public void setAwardAddr(String awardAddr) {
        this.awardAddr = awardAddr;
    }

    public Integer getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(Integer numberDay) {
        this.numberDay = numberDay;
    }

    public Integer getNumberTotal() {
        return numberTotal;
    }

    public void setNumberTotal(Integer numberTotal) {
        this.numberTotal = numberTotal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
