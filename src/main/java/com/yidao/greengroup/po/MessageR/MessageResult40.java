package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T40;
import com.yidao.greengroup.po.Enginer.T40Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult40 {
	public T40 t40 ;
	public List<T40Switch> list;

	public MessageResult40(T40 t40, List<T40Switch> list) {
		this.t40 = t40;
		this.list = list;
	}

	public T40 getT40() {
		return t40;
	}

	public void setT40(T40 t40) {
		this.t40 = t40;
	}

	public List<T40Switch> getList() {
		return list;
	}

	public void setList(List<T40Switch> list) {
		this.list = list;
	}
}
