package com.wy.report.dto;

import java.io.Serializable;

/**
 * Created by liub on 2015/01/21
 */
public class ParnterRecomdResult implements Serializable {

	private static final long serialVersionUID = 3536011916794201485L;

	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 身份证号
	 */
	private String idCard;

	/**
	 * 推荐人数
	 */
	private String recommendNumber;

	/**
	 * 手机号码
	 */
	private String mobileNumber;
	
	/**
	 * 地区
	 */
	private String area;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRecommendNumber() {
		return recommendNumber;
	}

	public void setRecommendNumber(String recommendNumber) {
		this.recommendNumber = recommendNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
