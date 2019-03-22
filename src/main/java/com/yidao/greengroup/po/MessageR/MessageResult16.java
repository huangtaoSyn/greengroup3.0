package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T16;
import com.yidao.greengroup.po.Enginer.T16Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult16 {
	public T16 t16 ;
	public List<T16Switch> list;

	public MessageResult16(T16 t16, List<T16Switch> list) {
		this.t16 = t16;
		this.list = list;
	}

	public T16 getT16() {
		return t16;
	}

	public void setT16(T16 t16) {
		this.t16 = t16;
	}

	public List<T16Switch> getList() {
		return list;
	}

	public void setList(List<T16Switch> list) {
		this.list = list;
	}
}
