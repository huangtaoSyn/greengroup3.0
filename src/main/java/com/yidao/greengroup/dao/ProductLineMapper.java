package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.ProductLine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 1:16
 * @version: $version$
 */
@Repository
public interface ProductLineMapper {
	public void addProductLine(ProductLine productLine);
	public Base findProductLineName(String bname);
	public List<ProductLine> findAllProductLine();
	public ProductLine findProductLineById(int id);
	public void updataProductLine(ProductLine productLine);
	public void deleProductLine(int id);
}
