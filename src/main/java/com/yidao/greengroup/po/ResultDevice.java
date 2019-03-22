package com.yidao.greengroup.po;/**
 * @author: huangtao
 * @description:  每个设备中带有基地 id   生产线id  自己的id
 * 查询的时候除去原本三个 还附带  基地id  生产线id  与设备中的 保存的对比
 * @date: 2019-03-10 19:19
 * @version: $version$
 */


public class ResultDevice {
	public int did; //设备id
	public int productlineid; //生产线id
	public String deviceName;   //设备名称
	public int rdid;//基地id

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getProductlineid() {
		return productlineid;
	}

	public void setProductlineid(int productlineid) {
		this.productlineid = productlineid;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getRdid() {
		return rdid;
	}
	public void setRdid(int rdid) {
		this.rdid = rdid;
	}

	@Override
	public String toString() {
		return "ResultDevice{" +
				"did=" + did +
				", productlineid=" + productlineid +
				", deviceName='" + deviceName + '\'' +
				", rdid=" + rdid +
				'}';
	}
}
