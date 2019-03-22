package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T43;
import com.yidao.greengroup.po.Enginer.T43Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult43 {
	public T43 t43 ;
	public List<T43Switch> list;

	public MessageResult43(T43 t43, List<T43Switch> list) {
		this.t43 = t43;
		this.list = list;
	}

	public T43 getT43() {
		return t43;
	}

	public void setT43(T43 t43) {
		this.t43 = t43;
	}

	public List<T43Switch> getList() {
		return list;
	}

	public void setList(List<T43Switch> list) {
		this.list = list;
	}
}
