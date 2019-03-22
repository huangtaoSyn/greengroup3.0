package com.yidao.greengroup.service.impl;

import com.yidao.greengroup.dao.BaseMapper;
import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Result;
import com.yidao.greengroup.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-07 23:55
 * @version: $version$
 */
@Service
public class BaseServiceImpl implements BaseService {
	@Autowired
	BaseMapper baseMapper;
	@Override
	public void addBase(Base base) {
		 baseMapper.addBase(base);
	}

	@Override
	public Base findBaseByName(String bname) {
		System.out.println("servcie"+bname);
		return baseMapper.findBaseByName(bname);
	}

	@Override
	public List<Base> findAllBase() {
		return baseMapper.findAllBase();
	}

	@Override
	public Base findBaseById(int id) {
		return baseMapper.findBaseById(id);
	}

	@Override
	public void updataBase(Base base) {
		 baseMapper.updataBase(base);
	}

	@Override
	public void dele(int[] ids) {
		for(int id:ids) {
			baseMapper.dele(id);
		}
	}
}
