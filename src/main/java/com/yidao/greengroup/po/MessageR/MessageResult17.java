package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T17;
import com.yidao.greengroup.po.Enginer.T17Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult17 {
	public T17 t17 ;
	public List<T17Switch> list;

	public MessageResult17(T17 t17, List<T17Switch> list) {
		this.t17 = t17;
		this.list = list;
	}

	public T17 getT17() {
		return t17;
	}

	public void setT17(T17 t17) {
		this.t17 = t17;
	}

	public List<T17Switch> getList() {
		return list;
	}

	public void setList(List<T17Switch> list) {
		this.list = list;
	}
}
