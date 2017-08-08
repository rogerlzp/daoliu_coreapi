package com.wy.market.api;

import com.wy.market.dto.LuckDrawEnter;
import com.wy.market.dto.LuckDrawResult;

/**
 * Created by znz on 2016/2/2.
 */
public interface LuckDrawService {
    /**
     * 抽奖
     * @param luckDrawEnter
     * @return
     */
    public LuckDrawResult getLuckDrawResult(LuckDrawEnter luckDrawEnter);

    /**
     * 根据手机号获取奖品
     * @param luckDrawEnter
     * @return
     */
    public LuckDrawResult getAwardByMobile(LuckDrawEnter luckDrawEnter);

    /**
     * 获取 发放返现券
     * @param luckDrawEnter
     * @return
     */
    public LuckDrawResult getShareAward(LuckDrawEnter luckDrawEnter);
}
