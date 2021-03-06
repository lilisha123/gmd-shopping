package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class1表对应的实体类
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
	 * 一级类别编号
	 * 
	 */
	private Integer class1Id;

	/**
	 * 一级类别名称
	 * 
	 */
	private String class1Name;

	/**
	 * 序号
	 * 
	 */
	private Integer class1Num;

	/**
	 * 备注
	 * 
	 */
	private String remark;

}