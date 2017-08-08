package com.wy.gateway.api;

import com.wy.gateway.dto.UmPayAccountEnter;
import com.wy.gateway.dto.UmPayAccountResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

/**
 * 对账文件下载接口
 * Created by znz on 2016/1/8.
 */
public interface DownloadSettleFileService {
    /**
     * 下载对应日期下载对账文件
     * @param date
     */
    public void downloadSettleFileByDay(Date date) throws IOException;
    /**
     * @param settle_date_p2p 对账日期
     * @param settle_type_p2p 对账类型
     */
    public byte[] downloadSettleFileByDay(String settle_date_p2p, String settle_type_p2p);
}
