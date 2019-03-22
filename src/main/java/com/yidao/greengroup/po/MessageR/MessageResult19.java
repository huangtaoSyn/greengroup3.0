package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T19;
import com.yidao.greengroup.po.Enginer.T19Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult19 {
	public T19 t19 ;
	public List<T19Switch> list;

	public MessageResult19(T19 t19, List<T19Switch> list) {
		this.t19 = t19;
		this.list = list;
	}

	public T19 getT19() {
		return t19;
	}

	public void setT19(T19 t19) {
		this.t19 = t19;
	}

	public List<T19Switch> getList() {
		return list;
	}

	public void setList(List<T19Switch> list) {
		this.list = list;
	}
}
