package com.yidao.greengroup.controller;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Device;
import com.yidao.greengroup.po.ProductLine;
import com.yidao.greengroup.po.Result;
import com.yidao.greengroup.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-05 2:11
 * @version: $version$
 */

@RestController
public class ProductLinerController {
    @Autowired
	ProductLineService productLineService;
	@RequestMapping("/addProductLine.do")
	public Result addProductLine(@RequestBody ProductLine productLine) {
		//System.out.println(productLine);
		try {
			productLineService.addProductLine(productLine);
			return new Result(true , "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "添加失败");
		}
	}

	@RequestMapping("/findProductLineName.do")
	public Base findProductLineName(String bname) {
		return null;
	}

	@RequestMapping("/findAllProductLine.do")
	public List<ProductLine> findAllProductLine() {
		return productLineService.findAllProductLine();
	}

	@RequestMapping("/findProductLineById.do")
	public ProductLine findProductLineById(int id) {
		return productLineService.findProductLineById(id);
	}

	@RequestMapping("/updataProductLine.do")
	public Result updataProductLine(@RequestBody ProductLine productLine) {
		//System.out.println(productLine);
		try {
			productLineService.updataProductLine(productLine);
			return new Result(true , "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "修改失败");
		}

	}

	@RequestMapping("/deleProductLine.do")
	public Result deleProductLine(int[] ids) {

		try {
			productLineService.deleProductLine(ids);
			return new Result(true , "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "删除失败");
		}

	}

}
