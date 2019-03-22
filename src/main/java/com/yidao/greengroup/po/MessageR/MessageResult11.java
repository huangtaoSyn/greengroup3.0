package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T10;
import com.yidao.greengroup.po.Enginer.T10Switch;
import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult11 {
	public T11 t11 ;
	public List<T11Switch> list;

	public MessageResult11(T11 t11, List<T11Switch> list) {
		this.t11 = t11;
		this.list = list;
	}

	public T11 getT11() {
		return t11;
	}

	public void setT11(T11 t11) {
		this.t11 = t11;
	}

	public List<T11Switch> getList() {
		return list;
	}

	public void setList(List<T11Switch> list) {
		this.list = list;
	}
}
