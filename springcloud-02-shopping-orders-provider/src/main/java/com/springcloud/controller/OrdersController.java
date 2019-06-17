package com.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
import com.springcloud.vo.ResultValue;

/**
 * 订单模块控制层
 * 
 * @author 李莉莎
 *
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;

	/**
	 * 查询满足条件的订单信息
	 * 
	 * @param orders     查询条件
	 * @param pageNumber 页数
	 * @return
	 */
	@RequestMapping(value = "/selectOrders")
	public ResultValue selectOrders(Orders orders, @RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<Orders> pageInfo = this.ordersService.selectOrders(orders, pageNumber);
			List<Orders> list = pageInfo.getList();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				// 将商品信息已制定的键存入map集合中
				map.put("ordersList", list);

				PageUtils pageUtils = new PageUtils(pageInfo.getPages() * 8);
				pageUtils.setPageNumber(pageNumber);
				// 将分页信息以指定的名字存入map集合中
				map.put("pageUtils", pageUtils);
				rv.setDataMap(map);
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("没有找得到满足条件的商品信息！！！");
		return rv;
	}

	/**
	 * 修改指定编号的订单的订单状态
	 * 
	 * @param orders
	 * @return
	 */
	@RequestMapping(value = "/updateOrdersStatus")
	public ResultValue updateOrdersStatus(Orders orders) {
		ResultValue rv = new ResultValue();
		try {
			Integer ordersStatus = this.ordersService.updateOrdersStatus(orders);
			if (ordersStatus > 0) {
				rv.setCode(0);
				rv.setMessage("订单状态修改成功！！");
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("修改订单状态失败！！！");
		return rv;
	}

	/**
	 * 查询指定范围内的销售额
	 * 
	 * @param orders 查询条件
	 * @return
	 */
	@RequestMapping(value = "/selectGroup")
	public ResultValue selectGroup(Orders orders) {
		ResultValue rv = new ResultValue();
		try {
			List<Orders> list = this.ordersService.selectGroup(orders);
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				List<String> x = new ArrayList<>();
				List<Double> y = new ArrayList<>();
				for(Orders o : list) {
					x.add(o.getOrderMonth());
					y.add(o.getOrderPrice());
				}
				Map<String,Object> map = new HashMap<>();
				map.put("x", x);
				map.put("y", y);
				rv.setDataMap(map);

				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}

}
