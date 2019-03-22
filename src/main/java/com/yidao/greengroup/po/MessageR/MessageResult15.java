package com.yidao.greengroup.po.MessageR;


import com.yidao.greengroup.po.Enginer.T15;
import com.yidao.greengroup.po.Enginer.T15Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult15 {
	public T15 t15 ;
	public List<T15Switch> list;

	public MessageResult15(T15 t15, List<T15Switch> list) {
		this.t15 = t15;
		this.list = list;
	}

	public T15 getT15() {
		return t15;
	}

	public void setT15(T15 t15) {
		this.t15 = t15;
	}

	public List<T15Switch> getList() {
		return list;
	}

	public void setList(List<T15Switch> list) {
		this.list = list;
	}
}
