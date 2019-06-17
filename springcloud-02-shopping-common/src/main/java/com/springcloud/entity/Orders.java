package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 8637324993553198139L;
	/**
	 * 订单编号
	 */

	private Integer orderId;

	/**
	 * 用户编号
	 */
	private Users user;

	/**
	 * 收货人姓名
	 */
	private String consigneeName;

	/**
	 * 收货人电话
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String consigneeNumber;

	/**
	 * 收货人地址
	 */
	private String consigneeSite;

	/**
	 * 下单时间
	 */
	private Date orderTime;

	/**
	 * 订单总额
	 */
	private Double orderAmount;

	/**
	 * 订单状态 0待付款,1待发货,2待收货,3已付款,4已退货
	 */
	private Integer orderStatus;

	/**
	 * 查询 条件订单起始时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;

	/**
	 * 查询条件订单终止时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;

	/**
	 * 查询条件：起始年月
	 */
	private String startMonth;

	/**
	 * 查询条件：终止年月
	 */
	private String endMonth;
	
	/**
	 * 统计结果的年月
	 */
	private String orderMonth;
	
	/**
	 * 统计结果销售额
	 */
	private Double orderPrice;

}