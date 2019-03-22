package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.Whls;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 3:03
 * @version: $version$
 */
@Repository
public interface WhlsMapper {
	public List<Whls>  findAllWhls();
	/*public Whls  findAllWhls();*/
}
