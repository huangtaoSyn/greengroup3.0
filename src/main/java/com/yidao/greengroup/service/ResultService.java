package com.yidao.greengroup.service;

import com.yidao.greengroup.po.ResultBase;
import com.yidao.greengroup.po.ResultDevice;
import com.yidao.greengroup.po.ResultProductLiner;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 19:44
 * @version: $version$
 */
public interface ResultService {
	public void addResultBase(ResultBase resultBase);
	public void addResultProductLiner(ResultProductLiner resultProductLiner);
	public void addResultDevice(ResultDevice resultDevice);
}
