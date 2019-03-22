package com.yidao.greengroup.po;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Base implements Serializable {
	public int id;
	public String bname;
	public String  createTime;
	public List<ProductLine> productLineList;

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

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

	public List<ProductLine> getProductLineList() {
		return productLineList;
	}

	public void setProductLineList(List<ProductLine> productLineList) {
		this.productLineList = productLineList;
	}

	@Override
	public String toString() {
		return "Base{" +
				"id=" + id +
				", bname='" + bname + '\'' +
				", createTime=" + createTime +
				", productLineList=" + productLineList +
				'}';
	}
}
