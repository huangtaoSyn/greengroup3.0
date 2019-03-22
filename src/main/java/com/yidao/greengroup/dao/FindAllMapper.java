package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.ResultBase;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 20:23
 * @version: $version$
 */
@Repository
public interface FindAllMapper {
	public List<ResultBase> findAll(int id);
	public void dele(@Param("corpId1") int productId,@Param("addrId1") int baseId);
	public List<ResultBase> searchBase();
	public void deleDevice(@Param("corpId") int productId,@Param("addrId") int baseId);
}
