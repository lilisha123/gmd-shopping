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
	 * �������
	 */

	private Integer orderId;

	/**
	 * �û����
	 */
	private Users user;

	/**
	 * �ջ�������
	 */
	private String consigneeName;

	/**
	 * �ջ��˵绰
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String consigneeNumber;

	/**
	 * �ջ��˵�ַ
	 */
	private String consigneeSite;

	/**
	 * �µ�ʱ��
	 */
	private Date orderTime;

	/**
	 * �����ܶ�
	 */
	private Double orderAmount;

	/**
	 * ����״̬ 0������,1������,2���ջ�,3�Ѹ���,4���˻�
	 */
	private Integer orderStatus;

	/**
	 * ��ѯ ����������ʼʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;

	/**
	 * ��ѯ����������ֹʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;

	/**
	 * ��ѯ��������ʼ����
	 */
	private String startMonth;

	/**
	 * ��ѯ��������ֹ����
	 */
	private String endMonth;
	
	/**
	 * ͳ�ƽ��������
	 */
	private String orderMonth;
	
	/**
	 * ͳ�ƽ�����۶�
	 */
	private Double orderPrice;

}