package com.wy.cloan.dto;

import com.wy.common.model.GeneralResult;
import com.wy.product.dto.Banner;
import com.wy.product.dto.ProductList;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public class CloanListResult extends GeneralResult implements Serializable {

    private static final long serialVersionUID = 6359812301239123132L;

    private List<CloanList> cloanList;

    public List<CloanList> getCloanList() {
        return cloanList;
    }

    public void setCloanList(List<CloanList> cloanList) {
        this.cloanList = cloanList;
    }
}