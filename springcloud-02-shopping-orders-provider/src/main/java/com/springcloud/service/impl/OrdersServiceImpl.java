package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.dao.OrdersMapper;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;

/**
 * 订单模块模型层的实现类，用于实现订单模块的方法
 * 
 * @author 李莉莎
 *
 */
@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersMapper odersMapper;

	@Override
	public PageInfo<Orders> selectOrders(Orders orders, Integer pageNumber) {
		if (orders.getUser() != null) {
			orders.getUser().setUserName("%" + orders.getUser().getUserName() + "%");
		}
		// 查询满足条件的订单信息
		PageHelper.startPage(pageNumber + 1, 8);
		List<Orders> list = this.odersMapper.selectOrders(orders);
		return new PageInfo<>(list);
	}
	@Transactional
	@Override
	public Integer updateOrdersStatus(Orders orders) {

		return this.odersMapper.updateOrdersStatus(orders);
	}
	@Override
	public List<Orders> selectGroup(Orders orders) {
		
		return this.odersMapper.selectGroup(orders);
	}

}
