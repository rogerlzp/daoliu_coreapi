package com.wy.gateway.api;

import com.wy.gateway.dto.UmPayAccountEnter;
import com.wy.gateway.dto.UmPayAccountResult;
import com.wy.gateway.dto.UmPayProductEnter;
import com.wy.gateway.dto.UmPayProductResult;
import com.wy.gateway.dto.UmpayTransferSearchResult;

/**
 * 
 * 4.3标的类接口 Created by liuyw on 2015/12/10.
 */
public interface UmPayProductService {

	/**
	 * 4.3.1发标(商户平台) 接收处理P2P平台发起的发标请求，并完成标的账户建立和标的协议建立。
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult mer_bind_project(UmPayProductEnter umPayProductEnter);

	/**
	 * 4.3.2标的更新(商户平台) 接收处理P2P平台发起的结标请求，并完成标的账户余额审核和标的协议的更新，同步响应商户交易结果。 四个独立功能：
	 * 1更新标的信息
	 * 2替换融资人（关系人操作类型为新增。当操作的是借款人时，操作含义是替换，仅限建标状态下可以替换；融资人替换只能是企业替换企业，个人替换个人
	 * ，不可以交叉。） 3新增和注销担保方 4新增和注销资金使用方（资金使用方可以支持个人和企业，一个标的可以有多个资金使用方，使用方类别不限，
	 * 即一个标的里可以同时有个人和企业的资金使用方角色） 注意：根据change_type填充响应字段。如果操作时填充了其他字段信息，则拒绝操作。
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult mer_update_project(UmPayProductEnter umPayProductEnter);

	/**
	 * 4.3.3标的转账(商户平台) 标的转入： 接收处理P2P平台发起的标的转入（对应业务场景为投资人投标或债权购买、融资人还款、担保方偿付）请求，
	 * 并完成其他账户资金划转到标的账户和相应记录的更新接收处理；
	 * 个人用户投资、债权购买、还款：用户通过页面验证手机动态码、交易密码，通过前后台通知的方式响应结果。 标的转出：
	 * P2P平台发起的标的转出（对应业务场景为流标后还款
	 * 、满标后缴费或放款、还款后返款、偿付后返款、债权转让的返款、撤资后的返款）请求，并完成标的账户资金划转到其他客户账户和相应记录的更新。
	 * 标的转账动作和标的状态的联动规则可以根据商户定制。 所有交易结果，无论同步或异步，交易成功后，都将使用“标的交易通知”告知商户结果。
	 * 每次动作凡是个人参与的都有短信通知并验密，如果是商户参与的无短信通知和验密。 验证码有效期：15分钟。 订单有效期：30分钟。
	 * 联动平台暂时不控制超投，需要平台方前端控制，如需联动平台辅助控制，需要特别告知，通过配置方式生效。 注意：企业还款和投资需使用无密标的转入接口。
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult project_transfer(UmPayProductEnter umPayProductEnter);

	public UmPayProductResult project_transfer_05(String order_id, String project_id, double amount);

	/**
	 * 52平台收费
	 * 
	 * @param order_id
	 * @param project_id
	 * @param amount
	 * @return
	 */
	public UmPayProductResult project_transfer_52(String order_id, String project_id, double amount);

	/**
	 * 标的转账、平台贴现
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult project_transfer_05(UmPayProductEnter umPayProductEnter);

	/**
	 * 4.3.4标的交易通知(平台商户) 商户接收标的交易结果。
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult project_tranfer_notify(UmPayProductEnter umPayProductEnter);

	/**
	 * 4.3.5无密标的转入(商户平台)
	 * 接收处理P2P平台发起的标的转入（对应业务场景为投资、还款）请求，不经过验密，直接完成其他账户资金划转到标的账户和相应记录的更新接收处理
	 * ，同步响应商户交易结果。 使用此接口的用户必须签订了借记卡快捷、无密快捷、无密投资、无密还款等协议之一。
	 * P2P平台需要上送用户账户号、标的号等字段，托管平台实现从用户账户到标的账户的资金划转。 交易成功，使用“标的交易通知”告知商户结果。
	 * 
	 * 注意：联动平台超投控制目前还不支持此接口的投资交易超投控制。
	 * 
	 * 企业还款和投资适用此接口。
	 * 
	 * @param umPayProductEnter
	 * @return
	 */
	public UmPayProductResult project_transfer_nopwd(UmPayProductEnter umPayProductEnter);

}
