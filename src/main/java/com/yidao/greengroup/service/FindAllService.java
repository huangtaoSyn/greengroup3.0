package com.yidao.greengroup.service;

import com.yidao.greengroup.po.ResultBase;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 20:26
 * @version: $version$
 */
public interface FindAllService {
	public List<ResultBase> findAll(int id);
	public void dele(Integer[] productId ,int  baseId);
	public List<ResultBase> searchBase();
	public void deleDevice(Integer[] productId,int  baseId);
}
