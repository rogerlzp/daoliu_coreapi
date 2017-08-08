package com.wy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyw on 2015/12/17.
 */
public class BankAccount implements Serializable {


    private static final long serialVersionUID = 1757393412561293163L;
    private Integer id;//编号
    private Long userId;//账户编号
    private String bankNo;//银行卡号
    private String gateId;//银行编号
    private String belongBank;//所属银行
    private String preMoblieNo;//预留手机号
    private String status;//状态 @see BankAccountEnum
    private String orderNo;//订单号
    private Date creatdDate;//创建时间
    private Date updatDate;//修改时间

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getGateId() {
        return gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreatdDate() {
        return creatdDate;
    }

    public void setCreatdDate(Date creatdDate) {
        this.creatdDate = creatdDate;
    }

    public Date getUpdatDate() {
        return updatDate;
    }

    public void setUpdatDate(Date updatDate) {
        this.updatDate = updatDate;
    }


}
