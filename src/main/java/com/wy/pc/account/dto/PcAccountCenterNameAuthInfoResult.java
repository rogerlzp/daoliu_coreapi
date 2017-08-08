package com.wy.pc.account.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/1.
 */
public class PcAccountCenterNameAuthInfoResult  extends GeneralResult implements Serializable {
    private static final long serialVersionUID = 5211812646647497137L;
    private String userName;// 姓名
    private String certification;// 实名认证
    private String cardId;// 身份证关联id

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
