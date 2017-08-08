package com.wy.cloan.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhengpingli on 2017/6/22.
 */
@Data
public class CloanCmsEnter implements Serializable {
    private static final long serialVersionUID = 1138465540873900029L;
    private String id;//
    private String cloanName;//'贷款名字'
    private String cloanLogo;//'图标URL'
    private String company;//公司ID， 待确认
    private String description;//待确认
    private int applyCustomer;//''申请人数''
    private double monthRate;//月利率
    private double dayRate;//日利率
    private double yearRate;//年利率

    private String applyCondition;//''申请人数''
    private String applyDescription;//''申请人数''


    private String checkStep1;//''申请步骤1''
    private String checkStep2;//''申请步骤2''
    private String checkStep3;//''申请步骤3''
    private String checkStep4;//''申请步骤4''
    private String checkStep5;//''申请步骤5''
    private String checkStep6;//''申请步骤6''

    private String orderTag;//''产品排序Tag''


    private String loanRange;//'贷款范围'
    private String rateRange;//'利率范围'
    private String dateRange;//'借款时间范围'

    private int loanMax;//'最多借款'
    private int loanMin;//'最少借款'
    private String passRate;//''PH:通过率高；PM：通过率中； PL：通过率低','

    private String status;//''1:有效   2:新建   0:撤出','

    private String cloanTags;// 产品标签

    private String cloanNo;// 产品标签
    private String cloanType;// '备用字段：产品类型'

    private Date createDate;//创建时间
    private String createBy;//创建人
    private String remark;//备注

    private int dateRangeMin;//'最少借款天数'
    private int dateRangeMax;//'最长借款天数'

    private double rateRangeMin;//''利率最低''

    private double rateRangeMax;//''利率最高''

    private String h5link; // 链接

    private int cloanOrder;//排序号
    private String contactPhone; //联系电话
    private int remitTime; //放款时间
    private String remitUnit; //放款时间单位， 分钟，小时，天数


}

