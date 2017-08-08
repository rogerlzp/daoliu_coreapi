package com.wy.pc.account.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;

/**
 * Created by znz on 2016/3/1.
 */
public class PcAccountCenterBankInfoResult  extends GeneralResult implements Serializable {
    private static final long serialVersionUID = -4096062004183715101L;
    private String userName;// 姓名
    private String belongBank;//所属银行
    private String bankCardId;// 银行卡号

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBelongBank() {
        return belongBank;
    }

    public void setBelongBank(String belongBank) {
        this.belongBank = belongBank;
    }

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }
}
