package com.yidao.greengroup.controller;

import com.yidao.greengroup.po.Base;
import com.yidao.greengroup.po.Device;
import com.yidao.greengroup.po.PageResult;
import com.yidao.greengroup.po.Result;
import com.yidao.greengroup.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-09 13:46
 * @version: $version$
 */

@RestController
public class DeviceController {
	@Autowired
	DeviceService deviceService;
	@RequestMapping("/addDevice.do")
	public Result addDevice(@RequestBody Device device) {
		//System.out.println(device);
		try {
			deviceService.addDevice(device);
			return new Result(true , "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "添加失败");
		}
	}

	@RequestMapping("/findDeviceByName.do")
	public Base findDeviceByName(String bname) {
		return deviceService.findDeviceByName(bname);
	}

	@RequestMapping("/findAllDevice.do")
	public List<Device> findAllDevice() {

		return deviceService.findAllDevice();
	}
	@RequestMapping("/findDeviceById.do")
	public Device findDeviceById(int id) {
		//System.out.println(id);
		return deviceService.findDeviceById(id);
	}

	@RequestMapping("/updataDevice.do")
	public Result updataDevice(@RequestBody Device device) {
		//System.out.println(device);
		try {
			deviceService.updataDevice(device);
			return new Result(true , "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "修改失败");
		}
	}

	@RequestMapping("/deleDevice.do")
	public Result deleDevice(int[] ids) {
		//System.out.println(ids);

		try {
			deviceService.deleDevice(ids);
			return new Result(true , "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false , "删除失败");
		}
	}
	@RequestMapping("/findDeviceByIds.do")
	public List<Device> findDeviceByIds(int[] ids) {
		return deviceService.findDeviceByIds(ids);
	}

	@RequestMapping("/findPage.do")
	public PageResult findPage(int page, int rows){
		return deviceService.findPage(page, rows);
	}

}
