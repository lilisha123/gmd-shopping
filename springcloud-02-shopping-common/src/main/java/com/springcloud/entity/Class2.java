package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class2���Ӧ��ʵ����
 * 
 * @author lala
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class2 implements java.io.Serializable {
	
	private static final long serialVersionUID = 13851492467804786L;

	/**
	 * ���2���
	 * 
	 */
	private Integer class2Id;

	/**
	 * ���2����
	 * 
	 */
	private String class2Name;

	/**
	 * ���1���
	 * 
	 */
	private Integer class1Id;

	/**
	 * ��ע
	 * 
	 */
	private String remark;

}