package com.yidao.greengroup.po;

import java.util.List;

/**
 * @author: huangtao
 * @description:   创建生产线用的  。
 * @date: 2019-03-10 19:12
 * @version: $version$
 */
public class ResultBase {
	public int id ;
	public String bname;
	//public int productLineId;
	public List<ResultProductLiner> resultProductLiner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<ResultProductLiner> getResultProductLiner() {
		return resultProductLiner;
	}

	public void setResultProductLiner(List<ResultProductLiner> resultProductLiner) {
		this.resultProductLiner = resultProductLiner;
	}
}
