package com.wy.common.constants;

public enum ProductStatusEnum {

	PRODUCT_STATUS_CG("-1", "草稿"),/*新创建的标的，  联动：发布*/
	PRODUCT_STATUS_KB("0", "开标"),/*临界状态，  联动：发布*/
	PRODUCT_STATUS_TBZ("1", "投标中"),/*可投标状态，  联动：*/
	PRODUCT_STATUS_HKZ("2", "还款中"),/*持有中，  联动：持有中*/
	PRODUCT_STATUS_YHK("3", "已还款"),/*已还款 */
	PRODUCT_STATUS_JS("4","结束"),
	PRODUCT_STATUS_LB("6","流标");
	
	private String enName;
	private String zhName;

	ProductStatusEnum(String enName, String zhName) {
		this.enName = enName;
		this.zhName = zhName;
	}

	public String getEnName() {
		return enName;
	}

	public String getZhName() {
		return zhName;
	}

	public static ProductStatusEnum getProductEnumByEnName(String enName) {
		for (ProductStatusEnum productStatusEnum : ProductStatusEnum.values()) {
			if (productStatusEnum.enName.equalsIgnoreCase(enName)) {
				return productStatusEnum;
			}
		}
		return null;
	}

}
