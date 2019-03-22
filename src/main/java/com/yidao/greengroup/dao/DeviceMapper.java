package com.yidao.greengroup.dao;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Device;
import com.yidao.greengroup.po.ProductLine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 13:38
 * @version: $version$
 */
@Repository
public interface DeviceMapper {
	public void addDevice(Device device);
	public Base findDeviceByName(String bname);
	public List<Device> findAllDevice();
	public Device findDeviceById(int id);
	public void updataDevice(Device device);
	public void deleDevice(int id);


}
