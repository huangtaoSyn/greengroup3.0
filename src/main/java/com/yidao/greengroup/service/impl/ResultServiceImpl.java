package com.yidao.greengroup.service.impl;

import com.yidao.greengroup.dao.ResultMapper;
import com.yidao.greengroup.po.ResultBase;
import com.yidao.greengroup.po.ResultDevice;
import com.yidao.greengroup.po.ResultProductLiner;
import com.yidao.greengroup.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 19:45
 * @version: $version$
 */

@Service
public class ResultServiceImpl implements ResultService {
	@Autowired
	ResultMapper resultMapper;
	@Override
	public void addResultBase(ResultBase resultBase) {
		resultMapper.addResultBase(resultBase);
	}

	@Override
	public void addResultProductLiner(ResultProductLiner resultProductLiner) {
       resultMapper.addResultProductLiner(resultProductLiner);
	}

	@Override
	public void addResultDevice(ResultDevice resultDevice) {
        resultMapper.addResultDevice(resultDevice);
	}
}
