package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T44;
import com.yidao.greengroup.po.Enginer.T44Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult44 {
	public T44 t44 ;
	public List<T44Switch> list;

	public MessageResult44(T44 t44, List<T44Switch> list) {
		this.t44 = t44;
		this.list = list;
	}

	public T44 getT44() {
		return t44;
	}

	public void setT44(T44 t44) {
		this.t44 = t44;
	}

	public List<T44Switch> getList() {
		return list;
	}

	public void setList(List<T44Switch> list) {
		this.list = list;
	}
}
