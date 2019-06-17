package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class2表对应的实体类
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
	 * 类别2编号
	 * 
	 */
	private Integer class2Id;

	/**
	 * 类别2名称
	 * 
	 */
	private String class2Name;

	/**
	 * 类别1编号
	 * 
	 */
	private Integer class1Id;

	/**
	 * 备注
	 * 
	 */
	private String remark;

}