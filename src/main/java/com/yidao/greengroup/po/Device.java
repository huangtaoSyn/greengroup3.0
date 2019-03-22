package com.yidao.greengroup.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-05 0:57
 * @version: 设备类
 */
public class Device implements Serializable {
	private  int did ;
	private String deviceName;
	private Date runStartTime;
	private Date runEndTime;
	private boolean devcieStatus ;
	private  double deviceEnginer ;
	private String deviceUseTime;
	private int productlineid; //生产线id


	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Date getRunStartTime() {
		return runStartTime;
	}

	public void setRunStartTime(Date runStartTime) {
		this.runStartTime = runStartTime;
	}

	public Date getRunEndTime() {
		return runEndTime;
	}

	public void setRunEndTime(Date runEndTime) {
		this.runEndTime = runEndTime;
	}

	public boolean isDevcieStatus() {
		return devcieStatus;
	}

	public void setDevcieStatus(boolean devcieStatus) {
		this.devcieStatus = devcieStatus;
	}

	public double getDeviceEnginer() {
		return deviceEnginer;
	}

	public void setDeviceEnginer(double deviceEnginer) {
		this.deviceEnginer = deviceEnginer;
	}

	public String getDeviceUseTime() {
		return deviceUseTime;
	}

	public void setDeviceUseTime(String deviceUseTime) {
		this.deviceUseTime = deviceUseTime;
	}

	public int getProductlineid() {
		return productlineid;
	}

	public void setProductlineid(int productlineid) {
		this.productlineid = productlineid;
	}

	@Override
	public String toString() {
		return "Device{" +
				"did=" + did +
				", deviceName='" + deviceName + '\'' +
				", runStartTime=" + runStartTime +
				", runEndTime=" + runEndTime +
				", devcieStatus=" + devcieStatus +
				", deviceEnginer=" + deviceEnginer +
				", deviceUseTime='" + deviceUseTime + '\'' +
				", productlineid=" + productlineid +
				'}';
	}
}
