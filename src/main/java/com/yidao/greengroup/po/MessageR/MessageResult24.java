package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T24;
import com.yidao.greengroup.po.Enginer.T24Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult24 {
	public T24 t24 ;
	public List<T24Switch> list;

	public MessageResult24(T24 t24, List<T24Switch> list) {
		this.t24 = t24;
		this.list = list;
	}

	public T24 getT24() {
		return t24;
	}

	public void setT24(T24 t24) {
		this.t24 = t24;
	}

	public List<T24Switch> getList() {
		return list;
	}

	public void setList(List<T24Switch> list) {
		this.list = list;
	}
}
