package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetail;

import com.springcloud.service.OrderDetailsService;
import com.springcloud.vo.ResultValue;

/**
 * 订单明细模块的控制层
 * 
 * @author lala
 *
 */
@RestController
@RequestMapping("OrderDetail")
public class OrdersDetailsController {
	@Autowired
	private OrderDetailsService orderDetailsService;

	@RequestMapping(value = "/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId") Integer orderId,
			@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<OrderDetail> pageInfo = this.orderDetailsService.selectByOrderId(orderId, pageNumber);
			List<OrderDetail> list = pageInfo.getList();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				// 将商品信息已制定的键存入map集合中
				map.put("orderDetailsList", list);

				PageUtils pageUtils = new PageUtils(5,pageInfo.getPages() * 8);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pageUtils);
				rv.setDataMap(map);
				return rv;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		rv.setCode(1);
		rv.setMessage("没有找到满足条件的订单信息");
		return rv;
	}

}
