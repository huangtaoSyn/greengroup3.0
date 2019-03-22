package com.yidao.greengroup.controller;

import com.yidao.greengroup.po.*;
import com.yidao.greengroup.po.FinalResult.FinalDevice;
import com.yidao.greengroup.po.FinalResult.FinalResult;
import com.yidao.greengroup.service.FindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangtao
 * @description:  应该先去生产线中选择基地
 * @date: 2019-03-10 20:22
 * @version: $version$
 */

@RestController
public class FindAllController {
	@Autowired
	FindAllService findAllService;
     public  List<Integer> list = new ArrayList<>();
     int iddis ;

	//后台的
	@RequestMapping("/findAll.do")
	public List<ResultBase> findAll(int id) {
		//System.out.println("后台的id"+id);
		iddis=id;
		return findAllService.findAll(id);
	}
    //显示的   如何实现  设置一个首选基地
	@RequestMapping("/findAlldispaly.do")
	public List<ResultBase> findAlldispaly() {
		return findAllService.findAll(iddis);
	}

//生产线id    基地id
	@RequestMapping("/dele1.do")
	public Result dele(Integer[] ids,Integer idbs) {
		try {
			findAllService.dele(ids ,idbs);
			findAllService.deleDevice(ids,idbs);
			return new Result(true , "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "删除失败");
		}
	}

	@RequestMapping("/searchBase.do")
	public List<ResultBase> searchBase(){
		return findAllService.searchBase();
	}

}
