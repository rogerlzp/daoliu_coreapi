package com.wy.user.api;

import com.wy.common.annotation.Role;
import com.wy.common.model.GeneralEnter;
import com.wy.common.model.GeneralResult;
import com.wy.gateway.dto.UmPayTradeResult;
import com.wy.pc.account.api.PcAccountBindCardService;
import com.wy.user.dto.*;

/**
 * 账户
 * Created by liuyw on 2015/12/11.
 */

public interface AccountService {


    @Role
    UserProfileResult getUserProfile(UserProfileEnter userProfileEnter);

    @Role
    UserProfileResult updateUserProfile(UserProfileEnter userProfileEnter);


    //获取临时的profile
    @Role
    UserIOSProfileResult getUserIOSProfile(UserIOSProfileEnter userIOSProfileEnter);

    //更新临时的profile
    @Role
    UserIOSProfileResult updateUserIOSProfile(UserIOSProfileEnter userIOSProfileEnter);


    //提交临时的申请
    @Role
    GeneralResult applySubmit(GeneralEnter generalEnter);

    @Role
    UserIOSSubmitResult getSubmitTime(UserIOSSubmitEnter userIOSSubmitEnter);
    /**
     * 获取用户信息
     */
    @Role
    UserInfoResult userInfo(AccountEnter accountEnter);


    /**
     * 实名认证
     */
    @Role
    AccountResult nameAuth(AccountEnter accountEnter);

    /**
     * 换卡
     *
     * @param accountEnter
     * @return
     */
    @Role
    UmAccountResult replaceCard(AccountEnter accountEnter);

    /**
     * 换卡进度
     *
     * @param accountEnter
     * @return
     */
    @Role
    BankAccountResult getReplaceCardStatus(GeneralEnter generalEnter);

    /**
     * 换卡进度已读设置接口
     *
     * @param accountEnter
     * @return
     */
    @Role
    BankAccountResult readReplaceCardStatus(String id);

    /**
     * 换卡进度已读查询接口
     *
     * @param id
     * @return
     */
    @Role
    BankAccountResult getReplaceCardCheckStatus(GeneralEnter generalEnter);

    @Role
    UmAccountResult bindCard(AccountEnter accountEnter);


    @Role
    BindCardResult bindCard2(AccountEnter accountEnter);

    /**
     * 根据用户id查询对应的资金账户
     */
    @Role
    AccountResult findUserAccountByUserId(AccountEnter accountEnter);

    /**
     * 根据用户id查询我的账户
     */
    @Role
    AccountResult findMyAccountByUserId(AccountEnter accountEnter);

    /**
     * 根据用户id查询我的投资
     */
    @Role
    InvestmentResult findMyInvestmentPage(InvestmentEnter accountEnter);

    /**
     * 根据用户id查询我的理财金券
     */
    @Role
    CouponResult findFinancialCouponByUserId(CouponEnter couponEnter);

    /**
     * 根据用户id查询我的有效理财金券 取最大面额的两个
     */
    @Role
    CouponResult findAvailableCouponByUserId(CouponEnter couponEnter);

    /**
     * 更新用户的可用余额
     */
    @Role
    AccountResult updateAccountBalance(AccountEnter accountEnter);

    /**
     * 修改用户的体验标状态
     *
     * @param accountEnter
     * @return
     */
    @Role
    AccountResult updateUserExperience(AccountEnter accountEnter);

    /**
     * 充值
     */
    @Role
    UmAccountResult recharge(AccountEnter accountEnter);

    /**
     * 预提现-返回剩余免费提现次数
     */
    @Role
    UmAccountResult preWithdrawals(AccountEnter accountEnter);

    /**
     * 提现
     */
    @Role
    UmAccountResult withdrawals(AccountEnter accountEnter);

    /**
     * 根据userId获取总资产信息
     */
    @Role
    AccountTotalResult findAccountTotalByUserId(AccountTotalEnter accountTotalEnter);

    /**
     * 获取鸟币流水
     */
    @Role
    BirdCoinListResult findBirdCoinList(BirdCoinListEnter birdCoinListEnter);

    /**
     * 获取账户信息
     */
    @Role
    UserAccountUserInfoResult findUserAccountUserInfo(UserAccountUserInfoEnter userAccountUserInfoEnter);

    /**
     * 合伙人累积奖励
     *
     * @param partnerEnter
     * @return
     */
    @Role
    PartnerResult findPartner(PartnerEnter partnerEnter);


    /**
     * 合伙人已发放奖励
     *
     * @param partnerEnter
     * @return
     */
    @Role
    PartnerEarningsResult findPartnerEarnings(PartnerEnter partnerEnter);

    /**
     * @param @param  userId
     * @param @return
     * @return BirdCoinAccount
     * @throws
     * @Description: 根据用户编号获取鸟币账户
     * @author Ciro
     * @date 2015年12月26日
     */
    @Role
    BirdCoinAccount findBirdCoinTotal(long userId);

    /**
     * 查看收益明细
     *
     * @param uncRevenueEnter
     * @return
     */
    @Role
    UncRevenueResult findRevenue(UncRevenueEnter uncRevenueEnter);


    /**
     * 处理充值通知
     *
     * @param result
     */
    AccountResult handleRechargeNotifyNotify(UmPayTradeResult result);


    /**
     * 处理pos机通知
     *
     * @param posGatewayEnter
     * @return
     */
    AccountResult handlePosRechargeNotify(PosGatewayEnter posGatewayEnter);

    /**
     * 兑换码
     *
     * @param exchangeCodeEnter
     * @return
     */
    @Role
    ExchangeCodeResult exchangeCode(ExchangeCodeEnter exchangeCodeEnter);
}
