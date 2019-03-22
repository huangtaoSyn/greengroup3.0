package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T27;
import com.yidao.greengroup.po.Enginer.T27Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult27 {
	public T27 t27 ;
	public List<T27Switch> list;

	public MessageResult27(T27 t27, List<T27Switch> list) {
		this.t27 = t27;
		this.list = list;
	}

	public T27 getT27() {
		return t27;
	}

	public void setT27(T27 t27) {
		this.t27 = t27;
	}

	public List<T27Switch> getList() {
		return list;
	}

	public void setList(List<T27Switch> list) {
		this.list = list;
	}
}
