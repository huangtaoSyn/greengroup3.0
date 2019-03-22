package com.yidao.greengroup.po.MessageR;

import com.yidao.greengroup.po.Enginer.T11;
import com.yidao.greengroup.po.Enginer.T11Switch;
import com.yidao.greengroup.po.Enginer.T41;
import com.yidao.greengroup.po.Enginer.T41Switch;

import java.util.List;

/**
 * @author: huangtao
 * @description:   拼接 数据和时间的
 * @date: 2019-03-14 4:44
 * @version: $version$
 */

public class MessageResult41 {
	public T41 t41 ;
	public List<T41Switch> list;

	public MessageResult41(T41 t41, List<T41Switch> list) {
		this.t41 = t41;
		this.list = list;
	}

	public T41 getT41() {
		return t41;
	}

	public void setT41(T41 t41) {
		this.t41 = t41;
	}

	public List<T41Switch> getList() {
		return list;
	}

	public void setList(List<T41Switch> list) {
		this.list = list;
	}
}
