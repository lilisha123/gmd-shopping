package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.springcloud.dao.GoodsMapper;
import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;

/**
 * 商品模型层的实现类，用于实现商品模块的方法
 * 
 * @author 李莉莎
 *
 */
@Service

public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodMapper;

	@Transactional
	@Override
	public Integer insert(Goods goods) {

		return this.goodMapper.insert(goods);
	}

	@Override
	public PageInfo<Goods> select(Goods goods, Integer pageNumber) {
		// 在商品名称的两端加上%
		goods.setGoodName("%" + goods.getGoodName() + "%");
		// 设置分页的信息
		PageHelper.startPage(pageNumber + 1, 8);
		// 查询满足条件的商品信息
		List<Goods> list = this.goodMapper.select(goods);
		return new PageInfo<>(list);
	}
	
	@Transactional
	@Override
	public Integer updateGoodsById(Goods goods) {
		
		return this.goodMapper.updateGoodsById(goods);
	}
	
	
	@Override
	public Integer update(Goods goods) {
		
		return this.goodMapper.updateByPrimaryKey(goods) ;
	}

	@Override
	public List<Goods> selectGroup() {
		
		return this.goodMapper.selectGroup();
	}

}
