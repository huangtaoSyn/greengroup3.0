package com.yidao.greengroup.controller;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 19:50
 * @version: $version$
 */

import com.yidao.greengroup.po.ResultBase;
import com.yidao.greengroup.po.ResultDevice;
import com.yidao.greengroup.po.ResultProductLiner;
import com.yidao.greengroup.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@ClassName huang
 *@Description TODO
 *@Author 20354
 *@Date 19:50
 *@Version 1.0
 */
@RestController
public class ResultController {
	@Autowired
	ResultService resultService;
	@RequestMapping("/addResultBase.do")
	public void addResultBase(@RequestBody ResultBase resultBase) {
		resultService.addResultBase(resultBase);
	}
	@RequestMapping("/addResultProductLiner.do")
	public void addResultProductLiner(@RequestBody ResultProductLiner resultProductLiner) {
		resultService.addResultProductLiner(resultProductLiner);
	}
	@RequestMapping("/addResultDevice.do")
	public void addResultDevice(@RequestBody ResultDevice resultDevice) {
		resultService.addResultDevice(resultDevice);
	}




}
