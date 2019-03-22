package com.yidao.greengroup.po.FinalResult;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-10 22:59
 * @version: $version$
 */
//设备集合类
public class FinalDevice {
	public int didFinalDevice;
	public String deviceFinalName;

	public int getDidFinalDevice() {
		return didFinalDevice;
	}

	public void setDidFinalDevice(int didFinalDevice) {
		this.didFinalDevice = didFinalDevice;
	}

	public String getDeviceFinalName() {
		return deviceFinalName;
	}

	public void setDeviceFinalName(String deviceFinalName) {
		this.deviceFinalName = deviceFinalName;
	}

	@Override
	public String toString() {
		return "FinalDevice{" +
				"didFinalDevice=" + didFinalDevice +
				", deviceFinalName='" + deviceFinalName + '\'' +
				'}';
	}
}
