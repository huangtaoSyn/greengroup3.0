package com.yidao.greengroup.service.impl;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 20:26
 * @version: $version$
 */

import com.yidao.greengroup.dao.FindAllMapper;
import com.yidao.greengroup.po.ResultBase;
import com.yidao.greengroup.service.FindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName huang
 *@Description TODO
 *@Author 20354
 *@Date 20:26
 *@Version 1.0
 */
@Service
public class FindAllImpl implements FindAllService {
	@Autowired
	FindAllMapper findAllMapper;
	@Override
	public List<ResultBase> findAll(int id) {
		return findAllMapper.findAll(id);
	}

	@Override
	public void dele(Integer[] productId ,int  baseId) {
		for(Integer idd:productId) {
			findAllMapper.dele(baseId,idd);
		}
	}

	@Override
	public List<ResultBase> searchBase() {
		return findAllMapper.searchBase();
	}

	@Override
	public void deleDevice(Integer[] productId ,int  baseId) {
		//当一次性传递来二个值的时候
		for(Integer idd:productId ){
			System.out.println("--------------");
			System.out.println(baseId);//基地id  1
			System.out.println(idd);//生产线id   8
			System.out.println("---------------");
			findAllMapper.deleDevice(baseId,idd);

		}

	}
}
