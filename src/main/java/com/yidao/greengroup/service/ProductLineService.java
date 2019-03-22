package com.yidao.greengroup.service;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.ProductLine;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 1:19
 * @version: $version$
 */

public interface ProductLineService {
	public void addProductLine(ProductLine productLine);
	public Base findProductLineName(String bname);
	public List<ProductLine> findAllProductLine();
	public ProductLine findProductLineById(int id);
	public void updataProductLine(ProductLine productLine);
	public void deleProductLine(int[] ids);
}
