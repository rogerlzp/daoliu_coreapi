package com.wy.pc.product.dto;

import com.wy.common.model.GeneralResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by znz on 2016/2/28.
 */
public class CurrentProductAccontInfoResult extends GeneralResult implements Serializable {
    private static final long serialVersionUID = -4031613346053859955L;
    private PcCurrentProductAccountInfo pcCurrentProductAccountInfo;
    private List<PcCurrentProductLast7DayIncome> pcCurrentProductLast7DayIncomeList;
    private PcCurrentProductAccumulatedIncome pcCurrentProductAccumulatedIncome;

    public PcCurrentProductAccountInfo getPcCurrentProductAccountInfo() {
        return pcCurrentProductAccountInfo;
    }

    public void setPcCurrentProductAccountInfo(PcCurrentProductAccountInfo pcCurrentProductAccountInfo) {
        this.pcCurrentProductAccountInfo = pcCurrentProductAccountInfo;
    }

    public List<PcCurrentProductLast7DayIncome> getPcCurrentProductLast7DayIncomeList() {
        return pcCurrentProductLast7DayIncomeList;
    }

    public void setPcCurrentProductLast7DayIncomeList(List<PcCurrentProductLast7DayIncome> pcCurrentProductLast7DayIncomeList) {
        this.pcCurrentProductLast7DayIncomeList = pcCurrentProductLast7DayIncomeList;
    }

    public PcCurrentProductAccumulatedIncome getPcCurrentProductAccumulatedIncome() {
        return pcCurrentProductAccumulatedIncome;
    }

    public void setPcCurrentProductAccumulatedIncome(PcCurrentProductAccumulatedIncome pcCurrentProductAccumulatedIncome) {
        this.pcCurrentProductAccumulatedIncome = pcCurrentProductAccumulatedIncome;
    }
}
