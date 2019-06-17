package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetail;

/**
 * ������ϸģ���ģ�Ͳ㣬���ڶ��嶩����ϸģ��ķ���
 * 
 * @author ����ɯ
 *
 */
public interface OrderDetailsService {

	/**
	 * ��ѯָ��������ŵĶ�����ϸ��Ϣ����ҳ���ܣ�
	 * 
	 * @param orderId �������
	 * @return �ɹ�����com.github.pagehelper.PageInfo�����͵�ʵ��
	 */
	public abstract PageInfo<OrderDetail> selectByOrderId(Integer orderId,Integer pageNumber);
}
