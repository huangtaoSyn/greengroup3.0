package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T30;
import com.yidao.greengroup.po.Enginer.T30Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult30 {
	public T30 t30 ;
	public List<T30Switch> list;

	public MessageResult30(T30 t30, List<T30Switch> list) {
		this.t30 = t30;
		this.list = list;
	}

	public T30 getT30() {
		return t30;
	}

	public void setT30(T30 t30) {
		this.t30 = t30;
	}

	public List<T30Switch> getList() {
		return list;
	}

	public void setList(List<T30Switch> list) {
		this.list = list;
	}
}
