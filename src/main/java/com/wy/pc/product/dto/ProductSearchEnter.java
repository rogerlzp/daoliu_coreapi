package com.wy.pc.product.dto;

import java.io.Serializable;

import com.wy.common.model.GeneralEnter;

public class ProductSearchEnter extends GeneralEnter implements Serializable{

	private static final long serialVersionUID = -155943491486659244L;
	
	private String productType;//产品类型
    private int productDeadlineStar;//产品期限Star
    private String deadlineUnitStar;//产品期限单位Star
    private int productDeadlineEnd;//产品期限end
    private String deadlineUnitEnd;//产品期限单位end
    private String productStatus;//产品状态
    
    private Integer convertDayStar;//折算天
    private Integer convertDayEnd;
    
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getProductDeadlineStar() {
		return productDeadlineStar;
	}
	public void setProductDeadlineStar(int productDeadlineStar) {
		this.productDeadlineStar = productDeadlineStar;
	}
	public String getDeadlineUnitStar() {
		return deadlineUnitStar;
	}
	public void setDeadlineUnitStar(String deadlineUnitStar) {
		this.deadlineUnitStar = deadlineUnitStar;
	}
	public int getProductDeadlineEnd() {
		return productDeadlineEnd;
	}
	public void setProductDeadlineEnd(int productDeadlineEnd) {
		this.productDeadlineEnd = productDeadlineEnd;
	}
	public String getDeadlineUnitEnd() {
		return deadlineUnitEnd;
	}
	public void setDeadlineUnitEnd(String deadlineUnitEnd) {
		this.deadlineUnitEnd = deadlineUnitEnd;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public Integer getConvertDayStar() {
		return convertDayStar;
	}
	public void setConvertDayStar(Integer convertDayStar) {
		this.convertDayStar = convertDayStar;
	}
	public Integer getConvertDayEnd() {
		return convertDayEnd;
	}
	public void setConvertDayEnd(Integer convertDayEnd) {
		this.convertDayEnd = convertDayEnd;
	}
}
