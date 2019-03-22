package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T29;
import com.yidao.greengroup.po.Enginer.T29Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult29 {
	public T29 t29 ;
	public List<T29Switch> list;

	public MessageResult29(T29 t29, List<T29Switch> list) {
		this.t29 = t29;
		this.list = list;
	}

	public T29 getT29() {
		return t29;
	}

	public void setT29(T29 t29) {
		this.t29 = t29;
	}

	public List<T29Switch> getList() {
		return list;
	}

	public void setList(List<T29Switch> list) {
		this.list = list;
	}
}
