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
 * ����ģ����Ʋ�
 * 
 * @author ����ɯ
 *
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;

	/**
	 * ��ѯ���������Ķ�����Ϣ
	 * 
	 * @param orders     ��ѯ����
	 * @param pageNumber ҳ��
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
				// ����Ʒ��Ϣ���ƶ��ļ�����map������
				map.put("ordersList", list);

				PageUtils pageUtils = new PageUtils(pageInfo.getPages() * 8);
				pageUtils.setPageNumber(pageNumber);
				// ����ҳ��Ϣ��ָ�������ִ���map������
				map.put("pageUtils", pageUtils);
				rv.setDataMap(map);
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("û���ҵõ�������������Ʒ��Ϣ������");
		return rv;
	}

	/**
	 * �޸�ָ����ŵĶ����Ķ���״̬
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
				rv.setMessage("����״̬�޸ĳɹ�����");
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("�޸Ķ���״̬ʧ�ܣ�����");
		return rv;
	}

	/**
	 * ��ѯָ����Χ�ڵ����۶�
	 * 
	 * @param orders ��ѯ����
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
