package com.wy.user.api;

import com.wy.user.dto.PosGatewayEnter;
import com.wy.user.dto.UmpayGatewayEnter;
import com.wy.user.dto.UmpayGatewayResult;

/**
 * Created by liuyw on 2015/12/17.
 */
public interface UmpayGatewayService {
    /**
     * 处理所有的联动优势主动返回的信息
     * @param umpayGatewayEnter
     * @return
     */
    UmpayGatewayResult umpayGateway(UmpayGatewayEnter umpayGatewayEnter);

    /**
     * 处理pos机返回的请求
     * @param posGatewayEnter
     * @return
     */
    UmpayGatewayResult posGateway(PosGatewayEnter posGatewayEnter);
}
