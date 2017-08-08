package com.wy.product.api;

import com.wy.common.model.GeneralEnter;
import com.wy.product.dto.BankEnter;
import com.wy.product.dto.BankListResult;
import com.wy.product.dto.BankResult;

/**
 * Created by znz on 2016/1/9.
 */
public interface BankLimitService {
    BankResult getBankLimit(BankEnter bankEnter);
    BankListResult getBankList(GeneralEnter generalEnter);
    BankResult getNotice(GeneralEnter generalEnter);
}
