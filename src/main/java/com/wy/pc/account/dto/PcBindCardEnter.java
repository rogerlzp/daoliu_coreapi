package com.wy.pc.account.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/2.
 */
public class PcBindCardEnter  extends GeneralEnter implements Serializable{
    private static final long serialVersionUID = -3529885199090658383L;
    private String belongBank;
    private String cardId;
    private String machineNo;// 唯一码
    private String pictureCode;// 图像验证码
    private String sourceV;//来源

    public String getSourceV() {
        return sourceV;
    }

    public void setSourceV(String sourceV) {
        this.sourceV = sourceV;
    }

    public String getBelongBank() {
        return belongBank;
    }

    public void setBelongBank(String belongBank) {
        this.belongBank = belongBank;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }
}
