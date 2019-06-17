package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * 一级类别与二级类别的控制器
 * 
 * @author lala
 *
 */
@RestController
@RequestMapping("type")
public class TypeController {

	@Autowired
	private TypeService typeServcie;
	
	/**
	 * 查询所有一级类别的信息
	 * @return
	 */
	@RequestMapping(value = "/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		try {
			//调用service相应的方法查询所有一级类别的信息，并保存查询的结果
			List<Class1> list = this.typeServcie.selectAllTypeOne();
			//如果查询成功
			if( list != null && list.size() > 0) {
				//设置结果的状态为0
				rv.setCode(0);
				//创建Map 集合
				Map<String,Object> map = new HashMap<>();
				//将查询结果存到map集合中
				map.put("class1List", list);
				//将map集合存到resultvalue对象中
				rv.setDataMap(map);
				//返回ResultValue对象
				return rv;
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	/**
	 * 根据一级类别查询对应的二级类别的信息
	 * @param class1Id
	 * @return
	 */
	@RequestMapping(value = "selectById")
	public ResultValue selectById(@RequestParam("class1Id") Integer class1Id) {

		ResultValue rv = new ResultValue();
		try {
			//调用service相应的方法查询所有一级类别的信息，并保存查询的结果
			List<Class2> list = this.typeServcie.selectTypeTwoByTypeOneId(class1Id);
			//如果查询成功
			if(list != null && list.size()>0) {
				//设置结果的状态为0
				rv.setCode(0);
				//创建Map 集合
				Map<String,Object> map = new HashMap<>();
				//将查询结果存到map集合中
				map.put("class2List", list);
				//将map集合存到resultvalue对象中
				rv.setDataMap(map);
				//返回ResultValue对象
				return rv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
}
