package com.wy.loan.dto;

import com.wy.common.model.GeneralEnter;

public class LoanEnter extends GeneralEnter {
	private static final long serialVersionUID = 8505028783862958403L;
	private Long cust_id;//用户编号
	private Integer loan_type;;//借贷类型：1-首付贷，2-首付垫，3-赎楼垫，4-尾款垫，0-通用
	private Long intent_id;//意向ID
	private String intent_username;//申请人姓名
	private Integer sex;//性别：0-男，1-女
	private String pspt_no;//身份证号码
	private String mobile_phone;//申请人电话
	private String borrow_amount;//款金额
	private String email;//邮箱地址
	private String house_cover;//房屋面积（首付贷）
	private String house_price;//购买单价（首付贷）
	private String d_payment_percent;//首付成数（首付贷）
	private Integer property_location;//物业位置（首付贷）：1-内环以内、2-内环外中环内、3-中环外外环内、4-外环以外
	private String house_advance;//房屋总价（通用类/首付垫/赎楼垫/尾款垫）
	private String mediation_name;//中介名称
	private String intent_area;//区域：见TD_M_AREA AREA_CODE 0021上海 0571杭州 0574宁波
	private String loan_date;//借款期限
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(Integer loan_type) {
		this.loan_type = loan_type;
	}
	public Long getIntent_id() {
		return intent_id;
	}
	public void setIntent_id(Long intent_id) {
		this.intent_id = intent_id;
	}
	public String getIntent_username() {
		return intent_username;
	}
	public void setIntent_username(String intent_username) {
		this.intent_username = intent_username;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPspt_no() {
		return pspt_no;
	}
	public void setPspt_no(String pspt_no) {
		this.pspt_no = pspt_no;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getBorrow_amount() {
		return borrow_amount;
	}
	public void setBorrow_amount(String borrow_amount) {
		this.borrow_amount = borrow_amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHouse_cover() {
		return house_cover;
	}
	public void setHouse_cover(String house_cover) {
		this.house_cover = house_cover;
	}
	public String getHouse_price() {
		return house_price;
	}
	public void setHouse_price(String house_price) {
		this.house_price = house_price;
	}
	public String getD_payment_percent() {
		return d_payment_percent;
	}
	public void setD_payment_percent(String d_payment_percent) {
		this.d_payment_percent = d_payment_percent;
	}
	public Integer getProperty_location() {
		return property_location;
	}
	public void setProperty_location(Integer property_location) {
		this.property_location = property_location;
	}
	public String getHouse_advance() {
		return house_advance;
	}
	public void setHouse_advance(String house_advance) {
		this.house_advance = house_advance;
	}
	public String getMediation_name() {
		return mediation_name;
	}
	public void setMediation_name(String mediation_name) {
		this.mediation_name = mediation_name;
	}
	public String getIntent_area() {
		return intent_area;
	}
	public void setIntent_area(String intent_area) {
		this.intent_area = intent_area;
	}
	public String getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	
}
