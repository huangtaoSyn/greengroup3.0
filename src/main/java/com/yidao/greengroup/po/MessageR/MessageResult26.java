package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T26;
import com.yidao.greengroup.po.Enginer.T26Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult26 {
	public T26 t26 ;
	public List<T26Switch> list;

	public MessageResult26(T26 t26, List<T26Switch> list) {
		this.t26 = t26;
		this.list = list;
	}

	public T26 getT26() {
		return t26;
	}

	public void setT26(T26 t26) {
		this.t26 = t26;
	}

	public List<T26Switch> getList() {
		return list;
	}

	public void setList(List<T26Switch> list) {
		this.list = list;
	}
}
