package com.wy.pc.account.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/1.
 */
public class PcNameAuthEnter  extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = 8789073395926952361L;
    private String  identityType;//证件类型
    private String  identityCode;//证件号码
    private String  userName;//姓名
    private String machineNo;// 唯一码
    private String pictureCode;// 图像验证码
    private String sourceV;//来源

    public String getSourceV() {
        return sourceV;
    }

    public void setSourceV(String sourceV) {
        this.sourceV = sourceV;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
