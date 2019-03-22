package com.yidao.greengroup.service;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Device;
import com.yidao.greengroup.po.PageResult;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 13:42
 * @version: $version$
 */
public interface DeviceService {
	public void addDevice(Device device);
	public Base findDeviceByName(String bname);
	public List<Device> findAllDevice();
	public Device findDeviceById(int id);
	public void updataDevice(Device device);
	public void deleDevice(int[] ids);
	public List<Device> findDeviceByIds(int[] ids);
	public PageResult findPage(int pageNum, int pageSize);
}
