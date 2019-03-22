package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T21;
import com.yidao.greengroup.po.Enginer.T21Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult21 {
	public T21 t21 ;
	public List<T21Switch> list;

	public MessageResult21(T21 t21, List<T21Switch> list) {
		this.t21 = t21;
		this.list = list;
	}

	public T21 getT21() {
		return t21;
	}

	public void setT21(T21 t21) {
		this.t21 = t21;
	}

	public List<T21Switch> getList() {
		return list;
	}

	public void setList(List<T21Switch> list) {
		this.list = list;
	}
}
