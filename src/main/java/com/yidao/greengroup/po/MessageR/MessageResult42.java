package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T42;
import com.yidao.greengroup.po.Enginer.T42Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult42 {
	public T42 t42 ;
	public List<T42Switch> list;

	public MessageResult42(T42 t42, List<T42Switch> list) {
		this.t42 = t42;
		this.list = list;
	}

	public T42 getT42() {
		return t42;
	}

	public void setT42(T42 t42) {
		this.t42 = t42;
	}

	public List<T42Switch> getList() {
		return list;
	}

	public void setList(List<T42Switch> list) {
		this.list = list;
	}
}
