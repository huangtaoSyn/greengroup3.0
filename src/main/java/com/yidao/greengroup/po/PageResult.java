package com.yidao.greengroup.po;

import java.io.Serializable;
import java.util.List;

/**
 * @author: huangtao
 * @description:   分页
 * @date: 2019-03-17 5:43
 * @version: $version$
 */


public class PageResult implements Serializable {
	private long total;//总记录数
	private List<Device> rows;//当前页结果

	public PageResult(long total, List<Device> rows) {
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<Device> getRows() {
		return rows;
	}

	public void setRows(List<Device> rows) {
		this.rows = rows;
	}
}
