package com.wy.pc.product.dto;

import java.io.Serializable;
import java.util.List;

import com.wy.common.model.GeneralResult;

public class NewProductResult extends GeneralResult implements Serializable{
	private static final long serialVersionUID = 3561814712786701135L;
	
	private NewProduct tyb;//体验标
	private NewProduct xsb;//新手标
	private String isBuyTyb;
	private String isBuyXsb;
	
	public NewProduct getTyb() {
		return tyb;
	}
	public void setTyb(NewProduct tyb) {
		this.tyb = tyb;
	}
	public NewProduct getXsb() {
		return xsb;
	}
	public void setXsb(NewProduct xsb) {
		this.xsb = xsb;
	}
	public String getIsBuyTyb() {
		return isBuyTyb;
	}
	public void setIsBuyTyb(String isBuyTyb) {
		this.isBuyTyb = isBuyTyb;
	}
	public String getIsBuyXsb() {
		return isBuyXsb;
	}
	public void setIsBuyXsb(String isBuyXsb) {
		this.isBuyXsb = isBuyXsb;
	}
}
