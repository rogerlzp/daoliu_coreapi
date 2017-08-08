package com.wy.product.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by liuyw on 2016/1/5.
 */
public class BankEnter extends GeneralEnter implements Serializable {
    private static final long serialVersionUID = -7657141698039700908L;
    private String belongBank;

    public String getBelongBank() {
        return belongBank;
    }

    public void setBelongBank(String belongBank) {
        this.belongBank = belongBank;
    }
}
