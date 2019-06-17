package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS 表对应的实体类
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
	 * 商品编号
	 * 
	 */
	private Integer goodId;

	/**
	 * 商品名称
	 * 
	 */
	private String goodName;

	/**
	 * 商品价格
	 * 
	 */
	private Double goodPrices;

	/**
	 * 商品折扣价
	 * 
	 */
	private Double goodDiscount;

	/**
	 * 
	 * 商品状态：0预售 1：热卖中 2：已下架
	 */
	private Integer goodStatus;

	/**
	 * 商品数量
	 * 
	 */
	private Integer goodCount;

	/**
	 * 是否新品：0是新品 1不是新品
	 * 
	 */
	private Integer goodIsNew;

	/**
	 * 商品是否热卖：0：预售，1：热卖中，2：已下架
	 * 
	 */
	private Integer goodIsHot;

	/**
	 * 商品等级
	 * 
	 */
	private Integer goodLevel;

	/**
	 * 商品简介
	 * 
	 */
	private String goodBrief;

	/**
	 * 商品详情
	 * 
	 */
	private String goodDetails;

	/**
	 * 商品照片
	 * 
	 */
	private String goodPhoto;

	/**
	 * 类别2编号
	 * 
	 */
	private Integer class2Id;

	/**
	 * 商品价格下限
	 * 
	 */
	private Double goodsPriceMin;

	/**
	 * 商品价格上限
	 * 
	 */
	private Double goodsPriceMax;

	/**
	 * 一级类别编号
	 * 
	 */
	private Integer class1Id;

	/**
	 * 商品销量，用于保存统计分组的结果
	 * 
	 */
	private Integer goodsSum;
}