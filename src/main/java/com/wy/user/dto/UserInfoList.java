package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UserInfoList implements Serializable{

	private static final long serialVersionUID = -2990479449532213983L;
	
	private long userId;
    private String userName;// 姓名
    private String mobile;// 手机号
    private String deviceToken;// 手机推送码
    private String certification;// 实名认证
    private String cardId;// 身份证关联id
    private String status;// 状态
    private String regDate;// 联动优势开户日期
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;//
    /** 修改表后添加的字段 */
    private String referralCode;// 推荐码
    private String bankAuthStatus;// 银行卡认证状态
    private String investStatus;// 投资状态
    private String umpayUserNo;// 联动用户号
    private String guestType;// 客户类型
    private String userLevelId;// 客户等级

    private int isExperience;// '0：未体验；1：已体验',
    private int isStaff;// 是否内部员工
    private int isFirstOrder;// 是否首次下单

    private String bankNo;//银行卡
    private String belongBank;//银行卡名称
    private String preMoblieNo;//银行预留手机号码

	private int isBasicInfo;// 是否提交资本资料
	private int isApplySubmit;// 是否提交申请


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDeviceToken() {
		return deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getReferralCode() {
		return referralCode;
	}
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	public String getBankAuthStatus() {
		return bankAuthStatus;
	}
	public void setBankAuthStatus(String bankAuthStatus) {
		this.bankAuthStatus = bankAuthStatus;
	}
	public String getInvestStatus() {
		return investStatus;
	}
	public void setInvestStatus(String investStatus) {
		this.investStatus = investStatus;
	}
	public String getUmpayUserNo() {
		return umpayUserNo;
	}
	public void setUmpayUserNo(String umpayUserNo) {
		this.umpayUserNo = umpayUserNo;
	}
	public String getGuestType() {
		return guestType;
	}
	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}
	public String getUserLevelId() {
		return userLevelId;
	}
	public void setUserLevelId(String userLevelId) {
		this.userLevelId = userLevelId;
	}
	public int getIsExperience() {
		return isExperience;
	}
	public void setIsExperience(int isExperience) {
		this.isExperience = isExperience;
	}
	public int getIsStaff() {
		return isStaff;
	}
	public void setIsStaff(int isStaff) {
		this.isStaff = isStaff;
	}
	public int getIsFirstOrder() {
		return isFirstOrder;
	}
	public void setIsFirstOrder(int isFirstOrder) {
		this.isFirstOrder = isFirstOrder;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getBelongBank() {
		return belongBank;
	}
	public void setBelongBank(String belongBank) {
		this.belongBank = belongBank;
	}
	public String getPreMoblieNo() {
		return preMoblieNo;
	}
	public void setPreMoblieNo(String preMoblieNo) {
		this.preMoblieNo = preMoblieNo;
	}
}
