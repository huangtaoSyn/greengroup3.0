package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T10;
import com.yidao.greengroup.po.Enginer.T10Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult10 {
	public T10 t10 ;
	public List<T10Switch> list;

	public MessageResult10(T10 t10, List<T10Switch> list) {
		this.t10 = t10;
		this.list = list;
	}

	public T10 getT10() {
		return t10;
	}

	public void setT10(T10 t10) {
		this.t10 = t10;
	}

	public List<T10Switch> getList() {
		return list;
	}

	public void setList(List<T10Switch> list) {
		this.list = list;
	}
}
