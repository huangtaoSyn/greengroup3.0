package com.yidao.greengroup.service.impl;

import com.yidao.greengroup.dao.ProductLineMapper;
import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.ProductLine;
import com.yidao.greengroup.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 1:20
 * @version: $version$
 */

@Service
public class ProductLineServiceImpl implements ProductLineService {
    @Autowired
	ProductLineMapper productLineMapper;

	@Override
	public void addProductLine(ProductLine productLine) {
        productLineMapper.addProductLine(productLine);
	}

	@Override
	public Base findProductLineName(String bname) {
		return null;
	}

	@Override
	public List<ProductLine> findAllProductLine() {

		return productLineMapper.findAllProductLine();
	}

	@Override
	public ProductLine findProductLineById(int id) {

		return productLineMapper.findProductLineById(id);
	}

	@Override
	public void updataProductLine(ProductLine productLine) {
       productLineMapper.updataProductLine(productLine);
	}

	@Override
	public void deleProductLine(int[] ids) {
		for (int id:ids) {
			productLineMapper.deleProductLine(id);

		}
	}
}
