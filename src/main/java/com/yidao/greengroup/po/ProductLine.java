package com.yidao.greengroup.po;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
//生产线类
/* 生产线不记录时间和生产线状态  运行状态由设备决定  启动时统计能耗
*  先遍历 基地  生产线 设备  先显示到界面中    ，当跳转过去根据id确保其在对应的生产线上 生产线与设备的详细  此刻  查询出
*
*   是否应该这样： 在系统设置中   单独创立 基地 生产线 设备   然后通过基地与生产线多对多的关系    ，生产线与设备多对多的关系
*                在后台设置中  将其拼接
*
*

*   创建生产线存入数据库   然后
*
*
* */
public class ProductLine implements Serializable {
	public  int productLineId ; //生产线id
	public  int baseId;   //基地id
	public String pname;  //生产线名称
	public String productLineUseTime ;//启用时间   一般不显示  在能耗
    public List<Device> devices;  //一对多    设备与生产线之间多对多

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

	public String getProductLineUseTime() {
		return productLineUseTime;
	}

	public void setProductLineUseTime(String productLineUseTime) {
		this.productLineUseTime = productLineUseTime;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}


	@Override
	public String toString() {
		return "ProductLine{" +
				"productLineId=" + productLineId +
				", baseId=" + baseId +
				", pname='" + pname + '\'' +
				", productLineUseTime='" + productLineUseTime + '\'' +
				", devices=" + devices +
				'}';
	}
}
