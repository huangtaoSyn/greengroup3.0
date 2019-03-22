package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T28;
import com.yidao.greengroup.po.Enginer.T28Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult28 {
	public T28 t28 ;
	public List<T28Switch> list;

	public MessageResult28(T28 t28, List<T28Switch> list) {
		this.t28 = t28;
		this.list = list;
	}

	public T28 getT28() {
		return t28;
	}

	public void setT28(T28 t28) {
		this.t28 = t28;
	}

	public List<T28Switch> getList() {
		return list;
	}

	public void setList(List<T28Switch> list) {
		this.list = list;
	}
}
