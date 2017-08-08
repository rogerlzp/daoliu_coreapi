package com.wy.user.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/2/17.
 */
public class AgreementEnter extends GeneralEnter implements Serializable {


    private static final long serialVersionUID = 4914416207949401130L;
    String agreement_type;//签约类型。
    String sourceV;//传入HTML5可访问手机页面，web不需要传入。

    public String getSourceV() {
        return sourceV;
    }

    public void setSourceV(String sourceV) {
        this.sourceV = sourceV;
    }

    public String getAgreement_type() {
        return agreement_type;
    }

    public void setAgreement_type(String agreement_type) {
        this.agreement_type = agreement_type;
    }
}
