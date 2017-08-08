package com.wy.pc.login.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by znz on 2016/2/25.
 */
public class PCLoginEnter extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = -3593033210606763118L;
    private String machineNo;// 机器唯一码
    private String mobileNo;// 手机号码
    private String password;// 密码
    private String pictureCode;// 图像验证码
    private String ip;// 用户登录的ip地址

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
