package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class1���Ӧ��ʵ����
 * 
 * @author lala
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5300706713029666878L;

	/**
	 * һ�������
	 * 
	 */
	private Integer class1Id;

	/**
	 * һ���������
	 * 
	 */
	private String class1Name;

	/**
	 * ���
	 * 
	 */
	private Integer class1Num;

	/**
	 * ��ע
	 * 
	 */
	private String remark;

}