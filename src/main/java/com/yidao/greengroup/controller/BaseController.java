package com.yidao.greengroup.controller;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Result;

import com.yidao.greengroup.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-07 23:57
 * @version: $version$
 */
@RestController
public class BaseController {
	@Autowired
	BaseService baseService;
	@RequestMapping("/addBase.do")
	public Result addBase(@RequestBody Base base){
		try {
			//System.out.println(base);
			baseService.addBase(base);
			return new Result(true , "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "添加失败");

		}
	}
	@RequestMapping("/addAll.do")
	public List<Base> findAllBase(){
		return baseService.findAllBase();
	}
    @RequestMapping("/findBaseById.do")
	public Base findBaseById(int id){
		//System.out.println(id);
		return baseService.findBaseById(id);
	}
	@RequestMapping("/updateBase.do")
	public Result updataBase(@RequestBody Base base){
		//System.out.println(base);
		try {
			baseService.updataBase(base);
			return new Result(true , "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "修改失败");
		}
	}
	@RequestMapping("/dele.do")
	public Result dele(int[] ids) {

		try {
			//System.out.println(ids);
			baseService.dele(ids);
			return new Result(true , "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "删除失败");
		}

	}

}
