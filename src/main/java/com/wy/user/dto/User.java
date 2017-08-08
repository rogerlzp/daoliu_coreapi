package com.wy.user.dto;

/**
 * Created by liuyw on 2015/11/11.
 */

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 用户表
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -3989703009492141950L;
    private long id;
    private String userName;// 姓名
    private String mobile;// 手机号
    private String password;// 登录密码
    private String deviceToken;// 手机推送码
    private String certification;// 实名认证
    private String cardId;// 身份证关联id
    private String status;// 状态

    private long createShopId; //创建该User的店铺Id

    private String regDate;// 联动优势开户日期
    private Date createDate;//

    /**
     * 修改表后添加的字段
     */
    private String referralCode;// 推荐码
    private String bankAuthStatus;// 银行卡认证状态
    private String investStatus;// 投资状态
    private Date updateDate;// 修改时间
    private String umpayUserNo;// 联动用户号
    private String umpayAccountNo;// 联动账户号
    private String guestType;// 客户类型
    private String userLevelId;// 客户等级 USER_LEVEL_ID

    private int isExperience;// '0：未体验；1：已体验',
    private int isStaff;// 是否内部员工
    private int isFirstOrder;// 是否首次下单

    private int isHasOrder;

    private int isBasicInfo;
    private int isApplySubmit;

    public String getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(String userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIsExperience() {
        return isExperience;
    }

    public void setIsExperience(int isExperience) {
        this.isExperience = isExperience;
    }

    public int getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(int isStaff) {
        this.isStaff = isStaff;
    }

    public int getIsFirstOrder() {
        return isFirstOrder;
    }

    public void setIsFirstOrder(int isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getBankAuthStatus() {
        return bankAuthStatus;
    }

    public void setBankAuthStatus(String bankAuthStatus) {
        this.bankAuthStatus = bankAuthStatus;
    }

    public String getInvestStatus() {
        return investStatus;
    }

    public void setInvestStatus(String investStatus) {
        this.investStatus = investStatus;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUmpayUserNo() {
        return umpayUserNo;
    }

    public void setUmpayUserNo(String umpayUserNo) {
        this.umpayUserNo = umpayUserNo;
    }

    public String getUmpayAccountNo() {
        return umpayAccountNo;
    }

    public void setUmpayAccountNo(String umpayAccountNo) {
        this.umpayAccountNo = umpayAccountNo;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getIsHasOrder() {
        return isHasOrder;
    }

    public void setIsHasOrder(int isHasOrder) {
        this.isHasOrder = isHasOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateShopId() {
        return createShopId;
    }

    public void setCreateShopId(long createShopId) {
        this.createShopId = createShopId;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", mobile=" + mobile + ", password=" + password + ", deviceToken="
                + deviceToken + ", certification=" + certification + ", cardId=" + cardId + ", status=" + status + ", regDate=" + regDate
                + ", createDate=" + createDate + ", referralCode=" + referralCode + ", bankAuthStatus=" + bankAuthStatus
                + ", investStatus=" + investStatus + ", updateDate=" + updateDate + ", umpayUserNo=" + umpayUserNo + ", umpayAccountNo="
                + umpayAccountNo + ", guestType=" + guestType + ", userLevelId=" + userLevelId + ", isExperience=" + isExperience
                + ", isStaff=" + isStaff + ", isFirstOrder=" + isFirstOrder + ", isHasOrder=" + isHasOrder + "]";
    }

    public static void main(String[] args) {
        User user = new User();
        user.setIsHasOrder(1);
        System.out.println(JSON.toJSONString(user));
    }

}
