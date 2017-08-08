package com.wy.merchant.api;

import com.wy.merchant.dto.MerchantAccountEnter;
import com.wy.merchant.dto.MerchantAccountResult;

/**
 * Created by znz on 2016/1/8.
 */
public interface MerchantAccountService {
    MerchantAccountResult queryMerchantAccount (MerchantAccountEnter MerchantAccountEnter);
}
