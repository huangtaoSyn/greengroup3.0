package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T18;
import com.yidao.greengroup.po.Enginer.T18Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult18 {
	public T18 t18 ;
	public List<T18Switch> list;

	public MessageResult18(T18 t18, List<T18Switch> list) {
		this.t18 = t18;
		this.list = list;
	}

	public T18 getT18() {
		return t18;
	}

	public void setT18(T18 t18) {
		this.t18 = t18;
	}

	public List<T18Switch> getList() {
		return list;
	}

	public void setList(List<T18Switch> list) {
		this.list = list;
	}
}
