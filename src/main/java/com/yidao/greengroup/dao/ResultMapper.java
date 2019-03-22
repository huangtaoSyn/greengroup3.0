package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.ResultBase;
import com.yidao.greengroup.po.ResultDevice;
import com.yidao.greengroup.po.ResultProductLiner;
import org.springframework.stereotype.Repository;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 19:36
 * @version: $version$
 */
@Repository
public interface ResultMapper {
	public void addResultBase(ResultBase resultBase);
	public void addResultProductLiner(ResultProductLiner resultProductLiner);
	public void addResultDevice(ResultDevice resultDevice);
}
