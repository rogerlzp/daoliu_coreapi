package com.wy.cloan.dto;

import com.wy.common.model.GeneralEnter;

import java.io.Serializable;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public class CloanListEnter  extends GeneralEnter implements Serializable {

    private static final long serialVersionUID = 3525761231859694108L;


    public Integer loanMin;
    public Integer dateRangeMin;

    public Integer getLoanMin() {
        return loanMin;
    }

    public void setLoanMin(Integer loanMin) {
        this.loanMin = loanMin;
    }

    public Integer getDateRangeMin() {
        return dateRangeMin;
    }

    public void setDateRangeMin(Integer dateRangeMin) {
        this.dateRangeMin = dateRangeMin;
    }
}
