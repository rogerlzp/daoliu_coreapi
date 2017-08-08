package com.wy.pc.loan.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/*
 * 借款意向
 */
public class Intent implements Serializable{
	private static final long serialVersionUID = -5544335078174466318L;
	private Long intent_id;//意向ID
	private Long cust_id;//客户ID
	private Integer loan_type;//借贷类型：1-首付贷，2-首付垫，3-赎楼垫，4-尾款垫，0-通用
	private String intent_username;//申请人姓名
	private String pspt_no;//身份证号码
	private String mobile_phone;//申请人电话
	private Integer sex;//性别：0-男，1-女
	private String email;//申请人邮箱
	private String intent_area;//区域：见TD_M_AREA AREA_CODE 0021上海 0571杭州 0574宁波
	private Integer loaner;//借款方属性（通用类独有）：1-买家，2-卖家
	private String house_advance;//房屋总价（通用类/首付垫/赎楼垫/尾款垫）
	private String borrow_amount;//借款金额
	private String loan_date;//借款期限
	private String intent_remark;//借款说明
	private Integer property_location;//物业位置（首付贷）：1-内环以内、2-内环外中环内、3-中环外外环内、4-外环以外
	private String house_cover;//房屋面积（首付贷）
	private String house_price;//购买单价（首付贷）
	private String d_payment_percent;//首付成数（首付贷）
	private String d_payment_advance;//首付金额（首付垫）
	private String r_loan_advance;//剩余按揭金额（赎楼垫）
	private String final_payment;//尾款金额（尾款垫）
	private Integer owner_depart_id;//所属部门
	private Integer owner_id;//所属人
	private Integer handle_user_id;//处理人
	private Integer follow_tag;//当前状态：11-待处理，21-跟进中，31-审核中，41-申请成功，42-申请失败
	private Integer valid_tag;//处理标记 0申请成功 1申请失败
	private String follow_remark;//当前状态处理信息
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date create_time;//创建时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date update_time;//更新时间
	private String mediation_name;//中介名称
	public Long getIntent_id() {
		return intent_id;
	}
	public void setIntent_id(Long intent_id) {
		this.intent_id = intent_id;
	}
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
	public String getIntent_username() {
		return intent_username;
	}
	public void setIntent_username(String intent_username) {
		this.intent_username = intent_username;
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
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntent_area() {
		return intent_area;
	}
	public void setIntent_area(String intent_area) {
		this.intent_area = intent_area;
	}
	public Integer getLoaner() {
		return loaner;
	}
	public void setLoaner(Integer loaner) {
		this.loaner = loaner;
	}
	public String getHouse_advance() {
		return house_advance;
	}
	public void setHouse_advance(String house_advance) {
		this.house_advance = house_advance;
	}
	public String getBorrow_amount() {
		return borrow_amount;
	}
	public void setBorrow_amount(String borrow_amount) {
		this.borrow_amount = borrow_amount;
	}
	public String getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	public String getIntent_remark() {
		return intent_remark;
	}
	public void setIntent_remark(String intent_remark) {
		this.intent_remark = intent_remark;
	}
	public Integer getProperty_location() {
		return property_location;
	}
	public void setProperty_location(Integer property_location) {
		this.property_location = property_location;
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
	public String getD_payment_advance() {
		return d_payment_advance;
	}
	public void setD_payment_advance(String d_payment_advance) {
		this.d_payment_advance = d_payment_advance;
	}
	public String getR_loan_advance() {
		return r_loan_advance;
	}
	public void setR_loan_advance(String r_loan_advance) {
		this.r_loan_advance = r_loan_advance;
	}
	public String getFinal_payment() {
		return final_payment;
	}
	public void setFinal_payment(String final_payment) {
		this.final_payment = final_payment;
	}
	public Integer getOwner_depart_id() {
		return owner_depart_id;
	}
	public void setOwner_depart_id(Integer owner_depart_id) {
		this.owner_depart_id = owner_depart_id;
	}
	public Integer getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(Integer owner_id) {
		this.owner_id = owner_id;
	}
	public Integer getHandle_user_id() {
		return handle_user_id;
	}
	public void setHandle_user_id(Integer handle_user_id) {
		this.handle_user_id = handle_user_id;
	}
	public Integer getFollow_tag() {
		return follow_tag;
	}
	public void setFollow_tag(Integer follow_tag) {
		this.follow_tag = follow_tag;
	}
	public String getFollow_remark() {
		return follow_remark;
	}
	public void setFollow_remark(String follow_remark) {
		this.follow_remark = follow_remark;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getMediation_name() {
		return mediation_name;
	}
	public void setMediation_name(String mediation_name) {
		this.mediation_name = mediation_name;
	}
	public Integer getValid_tag() {
		return valid_tag;
	}
	public void setValid_tag(Integer valid_tag) {
		this.valid_tag = valid_tag;
	}
	
}
