package com.wy.cloan.api;

import com.wy.cloan.dto.*;
import com.wy.common.model.PageResultData;
import com.wy.product.dto.ProductDetailEnter;
import com.wy.product.dto.ProductDetailResult;
import com.wy.product.dto.ProductEnter;
import com.wy.product.dto.ProductListResult;

/**
 * Created by zhengpingli on 2017/6/22.
 */
public interface CloanService {

    /**
     * 查询所有的借款产品
     *
     * @param cloanListEnter
     * @return
     *
     *
     */
    public CloanListResult allCloanList(CloanListEnter cloanListEnter);

    //获取产品详细记录
    public CloanDetailResult getCloanDetail(CloanDetailEnter cloanDetailEnter);

    /**
     * 获取产品列表
     *
     * @param cloanListEnter
     * @return
     */
    public CloanListResult findCloanList(CloanListEnter cloanListEnter);

    /**
     * 查询所有的产品
     *
     * @param cloanEnter
     * @return
     */
    public CloanListResult findCloanListPage(CloanEnter cloanEnter);


    /**
     * 查询所有的产品
     *
     * @param cloanTagEnter
     * @return
     */
    public CloanListResult findCloanListPage(CloanTagListEnter cloanTagEnter);

    /**
     * cms  保存/更新产品
     *
     * @param cloanCmsEnter
     * @return
     */
    public String saveCloan(CloanCmsEnter cloanCmsEnter);


    public String updateCloan(CloanCmsEnter cloanCmsEnter);



    // 添加用户浏览记录
    public CloanUserRecordResult addCloanUser(CloanUserRecordEnter cloanUserRecordEnter);

    // 查询用户浏览记录
    public CloanUserListResult getCloanUserList(CloanUserListEnter cloanUserListEnter);


    // 添加用户浏览记录
    public UserSearchRecordResult addUserSearch(UserSearchRecordEnter userSearchRecordEnter);

    // 查询用户浏览记录
    public UserSearchListResult getUserSearchList(UserSearchListEnter userSearchListEnter);


    /**
     * 查询所有的产品
     *
     * @param cloanStepListEnter
     * @return
     */
    public CloanStepListResult findCloanSteps(CloanStepListEnter cloanStepListEnter);


    public PageResultData list(long currentPage, long pageSize, String status);


    /**
     * 获取产品详情
     * @param cloanDetailEnter
     * @return
     */
    public CloanDetailResult findCloanDetail(CloanDetailEnter cloanDetailEnter);

}
