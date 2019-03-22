package com.yidao.greengroup.po;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 19:15
 * @version: $version$
 */
public class ResultProductLiner {
	public int productLineId;  //生产线id
	public int baseId;  //基地id
	public String pname;
	public List<ResultDevice> resultDevices;//设备集合

	public int getProductLineId() {
		return productLineId;
	}

	public void setProductLineId(int productLineId) {
		this.productLineId = productLineId;
	}

	public int getBaseId() {
		return baseId;
	}

	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<ResultDevice> getResultDevices() {
		return resultDevices;
	}

	public void setResultDevices(List<ResultDevice> resultDevices) {
		this.resultDevices = resultDevices;
	}



}
