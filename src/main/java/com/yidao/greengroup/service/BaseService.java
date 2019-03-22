package com.yidao.greengroup.service;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Result;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-07 23:55
 * @version: $version$
 */
public interface BaseService {
	public void addBase(Base base);
	public Base findBaseByName(String name);
	public List<Base> findAllBase();
	public Base findBaseById(int id);
	public void updataBase(Base base);
	public void dele(int[] ids);
}
