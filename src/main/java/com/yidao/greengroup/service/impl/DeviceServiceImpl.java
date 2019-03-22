package com.yidao.greengroup.service.impl;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 13:43
 * @version: $version$
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yidao.greengroup.dao.DeviceMapper;
import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Device;
import com.yidao.greengroup.po.PageResult;
import com.yidao.greengroup.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName huang
 *@Description TODO
 *@Author 20354
 *@Date 13:43
 *@Version 1.0
 */
@Service
public class DeviceServiceImpl implements DeviceService {
	@Autowired
	DeviceMapper deviceMapper;
	@Override
	public void addDevice(Device device) {
		deviceMapper.addDevice(device);
	}

	@Override
	public Base findDeviceByName(String bname) {
		return deviceMapper.findDeviceByName(bname);
	}

	@Override
	public List<Device> findAllDevice() {
		return deviceMapper.findAllDevice();
	}

	@Override
	public Device findDeviceById(int id) {
		return deviceMapper.findDeviceById(id);
	}

	@Override
	public void updataDevice(Device device) {
         deviceMapper.updataDevice(device);
	}

	@Override
	public void deleDevice(int[] ids) {
		for (int id:ids) {
			deviceMapper.deleDevice(id);
		}

	}

	@Override
	public List<Device> findDeviceByIds(int[] ids) {
		List<Device> list = new ArrayList<Device>();
		for (int id:ids) {
			Device device = deviceMapper.findDeviceById(id);
			list.add(device);
		}
		return list;
	}

	@Override
	public PageResult findPage(int currPage, int pageSize) {
		//查询全部数据
		List<Device> devices = deviceMapper.findAllDevice();
		int total = devices.size();
		//System.out.println("长度"+total);  //总长度
		//从第几条数据开始
		int firstIndex = (currPage - 1) * pageSize;
		//到第几条数据结束
		int lastIndex = currPage * pageSize;

		List<Device> list = new ArrayList<Device>();
		List<Device> devicess = devices.subList(firstIndex, lastIndex);

		for (int i = 0 ; i<devicess.size() ; i++){   //分页的内容
			list.add(devicess.get(i));
		}
		//System.out.println("集合"+list);
		PageResult pageResult = new PageResult(total,list);
		//return devices.subList(firstIndex, lastIndex); //直接在list中截取
		return  pageResult;
	}
}
