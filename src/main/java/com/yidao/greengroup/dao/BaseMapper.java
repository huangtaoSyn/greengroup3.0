package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-06 1:58
 * @version: 生产线  增删改查
 */
@Repository
public interface BaseMapper {
   public void addBase(Base base);
   public Base findBaseByName(String bname);
   public List<Base>  findAllBase();
   public Base findBaseById(int id);
   public void updataBase(Base base);
   public void dele(int id);
}
