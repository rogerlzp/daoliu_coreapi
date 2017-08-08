package com.wy.gateway.api;

import com.wy.gateway.dto.QiNiuTokenEnter;
import com.wy.gateway.dto.QiNiuTokenResult;

/**
 * Created by zhengpingli on 2017/4/11.
 */
public interface QiNiuTokenService {

    QiNiuTokenResult getQiNiuToken(QiNiuTokenEnter qiNiuTokenEnter);

}
