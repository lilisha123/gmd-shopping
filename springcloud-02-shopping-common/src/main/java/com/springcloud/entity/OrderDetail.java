package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail implements java.io.Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7380906867693247176L;

	/**
	 * 订单明细编号
	 */
	private Integer orderDetailId;

	/**
	 * 订单编号
	 */
	private Integer orderId;

	/**
	 * 商品编号
	 */
	private Integer goodId;

	/**
	 * 商品名称
	 */
	private String goodName;

	/**
	 * 交易价格
	 */
	private Double transactionPrice;

	/**
	 * 交易数量
	 */
	private Integer transactionCount;

}