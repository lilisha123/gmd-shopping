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
	 * ������ϸ���
	 */
	private Integer orderDetailId;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��Ʒ���
	 */
	private Integer goodId;

	/**
	 * ��Ʒ����
	 */
	private String goodName;

	/**
	 * ���׼۸�
	 */
	private Double transactionPrice;

	/**
	 * ��������
	 */
	private Integer transactionCount;

}