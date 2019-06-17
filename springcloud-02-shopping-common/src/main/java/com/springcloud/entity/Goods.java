package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS ���Ӧ��ʵ����
 * 
 * @author lala
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = 1353677937812774897L;

	/**
	 * ��Ʒ���
	 * 
	 */
	private Integer goodId;

	/**
	 * ��Ʒ����
	 * 
	 */
	private String goodName;

	/**
	 * ��Ʒ�۸�
	 * 
	 */
	private Double goodPrices;

	/**
	 * ��Ʒ�ۿۼ�
	 * 
	 */
	private Double goodDiscount;

	/**
	 * 
	 * ��Ʒ״̬��0Ԥ�� 1�������� 2�����¼�
	 */
	private Integer goodStatus;

	/**
	 * ��Ʒ����
	 * 
	 */
	private Integer goodCount;

	/**
	 * �Ƿ���Ʒ��0����Ʒ 1������Ʒ
	 * 
	 */
	private Integer goodIsNew;

	/**
	 * ��Ʒ�Ƿ�������0��Ԥ�ۣ�1�������У�2�����¼�
	 * 
	 */
	private Integer goodIsHot;

	/**
	 * ��Ʒ�ȼ�
	 * 
	 */
	private Integer goodLevel;

	/**
	 * ��Ʒ���
	 * 
	 */
	private String goodBrief;

	/**
	 * ��Ʒ����
	 * 
	 */
	private String goodDetails;

	/**
	 * ��Ʒ��Ƭ
	 * 
	 */
	private String goodPhoto;

	/**
	 * ���2���
	 * 
	 */
	private Integer class2Id;

	/**
	 * ��Ʒ�۸�����
	 * 
	 */
	private Double goodsPriceMin;

	/**
	 * ��Ʒ�۸�����
	 * 
	 */
	private Double goodsPriceMax;

	/**
	 * һ�������
	 * 
	 */
	private Integer class1Id;

	/**
	 * ��Ʒ���������ڱ���ͳ�Ʒ���Ľ��
	 * 
	 */
	private Integer goodsSum;
}