package com.yidao.greengroup.service.impl;

import com.yidao.greengroup.dao.T10Mapper;
import com.yidao.greengroup.dao.TSwitchMapper;
import com.yidao.greengroup.dao.WhlsMapper;
import com.yidao.greengroup.po.Enginer.*;
import com.yidao.greengroup.po.Whls;
import com.yidao.greengroup.service.WhlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 3:08
 * @version: $version$
 */

@Service
public class WhlsServiceImpl implements WhlsService {
	@Autowired
	WhlsMapper whlsMapper;
	@Autowired
	T10Mapper T10Mapper;
	@Autowired
	TSwitchMapper tSwitchMapper;
	@Override
	@Scheduled(cron ="0/5 * * * * *")
	public void findAllWhls() {

		//在这里组装数据
		List<Whls> allWhls = whlsMapper.findAllWhls();

		T10 t10 = new T10();
		T11 t11 = new T11();
		T15 t15 = new T15();
		T16 t16 = new T16();
		T17 t17 = new T17();
		T18 t18 = new T18();
		T19 t19 = new T19();
		T21 t21 = new T21();
		T22 t22 = new T22();
		T24 t24 = new T24();
		T26 t26 = new T26();
		T27 t27 = new T27();
		T28 t28 = new T28();
		T29 t29 = new T29();
		T30 t30 = new T30();
		T40 t40 = new T40();
		T41 t41 = new T41();
		T42 t42 = new T42();
		T43 t43 = new T43();
		T44 t44 = new T44();
		String value10 ="";  //存放数据到 状态记录中，
		String value11 ="";
		String value15 ="";
		String value16 ="";
		String value17 ="";
		String value18 ="";
		String value19 ="";
		String value21 ="";
		String value22 ="";
		String value24 ="";
		String value26 ="";
		String value27 ="";
		String value28 ="";
		String value29 ="";
		String value30 ="";
		String value40 ="";
		String value41 ="";
		String value42 ="";
		String value43 ="";
		String value44 ="";
		for (int i = 0 ; i<allWhls.size() ; i++){
			String topic = allWhls.get(i).getTopic();  //获取值
			 allWhls.get(i).getCurrentTime();
			String value = allWhls.get(i).getValue();
			String[] split = topic.split("/");
			int index=0;
			for (int k = 0 ; k < split[2].length(); k++){
				if(Character.isDigit(split[2].charAt(k))){
					index =k;
					break;
				}
			}

			String param1 = split[2].substring(index, split[2].length());//19
			String param2 = split[2].substring(0, index);//sdm ,sw
			String param3 = split[3];//v , a ,w ,wh ,switch16


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 10){
				//System.out.println(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					t10.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
                    t10.setCurrent(allWhls.get(i).getValue());
				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t10.setPower(allWhls.get(i).getValue());
				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value10 = allWhls.get(i).getValue();     //获取wh的值-------------
					//System.out.println("wh value1的值:"+value1);
					t10.setWh(allWhls.get(i).getValue());
                //单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T10Switch t10Switch1 = tSwitchMapper.findT10Switch1();//为了获取最近存入的状态值
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t10Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T10Switch t10Switch = new T10Switch();
						t10Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t10Switch.setSwitchStatus(allWhls.get(i).getValue());
						t10Switch.setCurrentWh(value10); //新修改的-------------
						tSwitchMapper.addT10Switch(t10Switch);
					}
				}

				if((t10.getVoltage() !=null)&&(t10.getCurrent() !=null)&&(t10.getWh() !=null)&&(t10.getPower() !=null)) {
					t10.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT10Data(t10);
					t10 .setPower(null);
					t10 .setCurrent(null);
					t10 .setVoltage(null);
					t10 .setWh(null);
				}

			}



			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 11){
				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					t11.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t11.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t11.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value11 = allWhls.get(i).getValue();  //没问题
					//System.out.println("wh value144的值:"+value11);
					t11.setWh(allWhls.get(i).getValue());
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T11Switch t11Switch1 = tSwitchMapper.findT11Switch1();//为了获取最近存入的状态值
					    if (!t11Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())) {
							T11Switch t11Switch = new T11Switch();
							t11Switch.setLogTime(allWhls.get(i).getCurrentTime());
							t11Switch.setSwitchStatus(allWhls.get(i).getValue());
                            t11Switch.setCurrentWh(value11);
                            tSwitchMapper.addT11Switch(t11Switch);
						}

					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t11.getVoltage() !=null)&&(t11.getCurrent() !=null)&&(t11.getWh() !=null)&&(t11.getPower() !=null)) {
					t11.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT11Data(t11);
					t11 .setPower(null);
					t11 .setCurrent(null);
					t11 .setVoltage(null);
					t11 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 15){
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					t15.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t15.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t15.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value15 = allWhls.get(i).getValue();
					t15.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T15Switch t15Switch1 = tSwitchMapper.findT15Switch1();//为了获取最近存入的状态值
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t15Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T15Switch t15Switch = new T15Switch();
						t15Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t15Switch.setSwitchStatus(allWhls.get(i).getValue());
						t15Switch.setCurrentWh(value15);
						tSwitchMapper.addT15Switch(t15Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t15.getVoltage() !=null)&&(t15.getCurrent() !=null)&&(t15.getWh() !=null)&&(t15.getPower() !=null)) {
					t15.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT15Data(t15);
					t15 .setPower(null);
					t15 .setCurrent(null);
					t15 .setVoltage(null);
					t15 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 16){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					//System.out.println("777777");
					//System.out.println(allWhls.get(i).getValue());
					t16.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t16.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t16.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value16 = allWhls.get(i).getValue();
					t16.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T16Switch t16Switch1 = tSwitchMapper.findT16Switch1();//为了获取最近存入的状态值

					if(!t16Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T16Switch t16Switch = new T16Switch();
						t16Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t16Switch.setSwitchStatus(allWhls.get(i).getValue());
						t16Switch.setCurrentWh(value16);
						tSwitchMapper.addT16Switch(t16Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t16.getVoltage() !=null)&&(t16.getCurrent() !=null)&&(t16.getWh() !=null)&&(t16.getPower() !=null)) {
					t16.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT16Data(t16);
					t16 .setPower(null);
					t16 .setCurrent(null);
					t16 .setVoltage(null);
					t16 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 17){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					//System.out.println("777777");
					//System.out.println(allWhls.get(i).getValue());
					t17.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t17.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t17.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value17 = allWhls.get(i).getValue();
					t17.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T17Switch t17Switch1 = tSwitchMapper.findT17Switch1();//为了获取最近存入的状态值
					//System.out.println("55555555555555555555555555555");
					//System.out.println(t10Switch1.getSwitchStatus());
					//System.out.println(allWhls.get(i).getValue());
					//System.out.println("55555555555555555555555555555");
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t17Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T17Switch t17Switch = new T17Switch();
						t17Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t17Switch.setSwitchStatus(allWhls.get(i).getValue());
						t17Switch.setCurrentWh(value17);
						tSwitchMapper.addT17Switch(t17Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t17.getVoltage() !=null)&&(t17.getCurrent() !=null)&&(t17.getWh() !=null)&&(t17.getPower() !=null)) {
					t17.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT17Data(t17);
					t17 .setPower(null);
					t17 .setCurrent(null);
					t17 .setVoltage(null);
					t17 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 18){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					//System.out.println("777777");
					//System.out.println(allWhls.get(i).getValue());
					t18.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t18.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t18.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value18 = allWhls.get(i).getValue();
					t18.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T18Switch t18Switch1 = tSwitchMapper.findT18Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t18Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T18Switch t18Switch = new T18Switch();
						t18Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t18Switch.setSwitchStatus(allWhls.get(i).getValue());
						t18Switch.setCurrentWh(value18);
						tSwitchMapper.addT18Switch(t18Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t18.getVoltage() !=null)&&(t18.getCurrent() !=null)&&(t18.getWh() !=null)&&(t18.getPower() !=null)) {
					t18.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT18Data(t18);


					t18 .setPower(null);
					t18 .setCurrent(null);
					t18 .setVoltage(null);

					t18 .setWh(null);
				}

			}

			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 19){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					//System.out.println("777777");
					//System.out.println(allWhls.get(i).getValue());
					t19.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t19.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t19.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value19 = allWhls.get(i).getValue();
					t19.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T19Switch t19Switch1 = tSwitchMapper.findT19Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t19Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T19Switch t19Switch = new T19Switch();
						t19Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t19Switch.setSwitchStatus(allWhls.get(i).getValue());
						t19Switch.setCurrentWh(value19);
						tSwitchMapper.addT19Switch(t19Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t19.getVoltage() !=null)&&(t19.getCurrent() !=null)&&(t19.getWh() !=null)&&(t19.getPower() !=null)) {
					t19.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT19Data(t19);
					//System.out.println("999999999999999999999999999");

					t19 .setPower(null);
					t19 .setCurrent(null);
					t19 .setVoltage(null);

					t19 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 21){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t21.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t21.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t21.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value21 = allWhls.get(i).getValue();
					t21.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T21Switch t21Switch1 = tSwitchMapper.findT21Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t21Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T21Switch t21Switch = new T21Switch();
						t21Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t21Switch.setSwitchStatus(allWhls.get(i).getValue());
						t21Switch.setCurrentWh(value21);
						tSwitchMapper.addT21Switch(t21Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t21.getVoltage() !=null)&&(t21.getCurrent() !=null)&&(t21.getWh() !=null)&&(t21.getPower() !=null)) {
					t21.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT21Data(t21);
					t21 .setPower(null);
					t21 .setCurrent(null);
					t21 .setVoltage(null);

					t21 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 22){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t22.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t22.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t22.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value22 = allWhls.get(i).getValue();
					t22.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T22Switch t22Switch1 = tSwitchMapper.findT22Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t22Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T22Switch t22Switch = new T22Switch();
						t22Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t22Switch.setSwitchStatus(allWhls.get(i).getValue());
						t22Switch.setCurrentWh(value22);
						tSwitchMapper.addT22Switch(t22Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t22.getVoltage() !=null)&&(t22.getCurrent() !=null)&&(t22.getWh() !=null)&&(t22.getPower() !=null)) {
					t22.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT22Data(t22);


					t22 .setPower(null);
					t22 .setCurrent(null);
					t22 .setVoltage(null);

					t22 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 24){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					//System.out.println("777777");
					//System.out.println(allWhls.get(i).getValue());
					t24.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t24.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t24.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value24 = allWhls.get(i).getValue();
					t24.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T24Switch t24Switch1 = tSwitchMapper.findT24Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t24Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T24Switch t24Switch = new T24Switch();
						t24Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t24Switch.setSwitchStatus(allWhls.get(i).getValue());
						t24Switch.setCurrentWh(value24);
						tSwitchMapper.addT24Switch(t24Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t24.getVoltage() !=null)&&(t24.getCurrent() !=null)&&(t24.getWh() !=null)&&(t24.getPower() !=null)) {
					t24.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT24Data(t24);
					//System.out.println("999999999999999999999999999");

					t24 .setPower(null);
					t24 .setCurrent(null);
					t24 .setVoltage(null);

					t24 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 26){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t26.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t26.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t26.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value26 = allWhls.get(i).getValue();
					t26.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T26Switch t26Switch1 = tSwitchMapper.findT26Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t26Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T26Switch t26Switch = new T26Switch();
						t26Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t26Switch.setSwitchStatus(allWhls.get(i).getValue());
						t26Switch.setCurrentWh(value26);
						tSwitchMapper.addT26Switch(t26Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t26.getVoltage() !=null)&&(t26.getCurrent() !=null)&&(t26.getWh() !=null)&&(t26.getPower() !=null)) {
					t26.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT26Data(t26);
					//System.out.println("999999999999999999999999999");

					t26 .setPower(null);
					t26 .setCurrent(null);
					t26 .setVoltage(null);

					t26 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 27){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t27.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t27.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t27.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value27 = allWhls.get(i).getValue();
					t27.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T27Switch t27Switch1 = tSwitchMapper.findT27Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t27Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T27Switch t27Switch = new T27Switch();
						t27Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t27Switch.setSwitchStatus(allWhls.get(i).getValue());
						t27Switch.setCurrentWh(value27);
						tSwitchMapper.addT27Switch(t27Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t27.getVoltage() !=null)&&(t27.getCurrent() !=null)&&(t27.getWh() !=null)&&(t27.getPower() !=null)) {
					t27.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT27Data(t27);


					t27 .setPower(null);
					t27 .setCurrent(null);
					t27 .setVoltage(null);

					t27 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 28){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t28.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t28.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t28.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value28 = allWhls.get(i).getValue();
					t28.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T28Switch t28Switch1 = tSwitchMapper.findT28Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t28Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T28Switch t28Switch = new T28Switch();
						t28Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t28Switch.setSwitchStatus(allWhls.get(i).getValue());
						t28Switch.setCurrentWh(value28);
						tSwitchMapper.addT28Switch(t28Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t28.getVoltage() !=null)&&(t28.getCurrent() !=null)&&(t28.getWh() !=null)&&(t28.getPower() !=null)) {
					t28.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT28Data(t28);
					//System.out.println("999999999999999999999999999");

					t28 .setPower(null);
					t28 .setCurrent(null);
					t28 .setVoltage(null);

					t28 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 29){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t29.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t29.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t29.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value29 = allWhls.get(i).getValue();
					t29.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T29Switch t29Switch1 = tSwitchMapper.findT29Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t29Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T29Switch t29Switch = new T29Switch();
						t29Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t29Switch.setSwitchStatus(allWhls.get(i).getValue());
						t29Switch.setCurrentWh(value29);
						tSwitchMapper.addT29Switch(t29Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t29.getVoltage() !=null)&&(t29.getCurrent() !=null)&&(t29.getWh() !=null)&&(t29.getPower() !=null)) {
					t29.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT29Data(t29);
					//System.out.println("999999999999999999999999999");

					t29 .setPower(null);
					t29 .setCurrent(null);
					t29 .setVoltage(null);

					t29 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 30){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t30.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t30.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t30.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value30 = allWhls.get(i).getValue();
					t30.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T30Switch t30Switch1 = tSwitchMapper.findT30Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t30Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T30Switch t30Switch = new T30Switch();
						t30Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t30Switch.setSwitchStatus(allWhls.get(i).getValue());
						t30Switch.setCurrentWh(value30);
						tSwitchMapper.addT30Switch(t30Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t30.getVoltage() !=null)&&(t30.getCurrent() !=null)&&(t30.getWh() !=null)&&(t30.getPower() !=null)) {
					t30.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT30Data(t30);
					//System.out.println("999999999999999999999999999");

					t30 .setPower(null);
					t30 .setCurrent(null);
					t30 .setVoltage(null);

					t30 .setWh(null);
				}

			}

			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 40){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t40.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t40.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t40.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value40 = allWhls.get(i).getValue();
					t40.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T40Switch t40Switch1 = tSwitchMapper.findT40Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t40Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T40Switch t40Switch = new T40Switch();
						t40Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t40Switch.setSwitchStatus(allWhls.get(i).getValue());
						t40Switch.setCurrentWh(value40);
						tSwitchMapper.addT40Switch(t40Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t40.getVoltage() !=null)&&(t40.getCurrent() !=null)&&(t40.getWh() !=null)&&(t40.getPower() !=null)) {
					t40.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT40Data(t40);
					//.out.println("999999999999999999999999999");

					t40 .setPower(null);
					t40 .setCurrent(null);
					t40 .setVoltage(null);

					t40 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 41){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t41.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t41.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t41.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value41 = allWhls.get(i).getValue();
					t41.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T41Switch t41Switch1 = tSwitchMapper.findT41Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t41Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T41Switch t41Switch = new T41Switch();
						t41Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t41Switch.setSwitchStatus(allWhls.get(i).getValue());
						t41Switch.setCurrentWh(value41);
						tSwitchMapper.addT41Switch(t41Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t41.getVoltage() !=null)&&(t41.getCurrent() !=null)&&(t41.getWh() !=null)&&(t41.getPower() !=null)) {
					t41.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT41Data(t41);
					//System.out.println("999999999999999999999999999");

					t41 .setPower(null);
					t41 .setCurrent(null);
					t41 .setVoltage(null);

					t41 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 42){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t42.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t42.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t42.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value42 = allWhls.get(i).getValue();
					t42.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T42Switch t42Switch1 = tSwitchMapper.findT42Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t42Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T42Switch t42Switch = new T42Switch();
						t42Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t42Switch.setSwitchStatus(allWhls.get(i).getValue());
						t42Switch.setCurrentWh(value42);
						tSwitchMapper.addT42Switch(t42Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t42.getVoltage() !=null)&&(t42.getCurrent() !=null)&&(t42.getWh() !=null)&&(t42.getPower() !=null)) {
					t42.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT42Data(t42);
					//System.out.println("999999999999999999999999999");

					t42 .setPower(null);
					t42 .setCurrent(null);
					t42 .setVoltage(null);

					t42 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 43){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t43.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t43.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t43.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value43 = allWhls.get(i).getValue();
					t43.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T43Switch t43Switch1 = tSwitchMapper.findT43Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t43Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T43Switch t43Switch = new T43Switch();
						t43Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t43Switch.setSwitchStatus(allWhls.get(i).getValue());
						t43Switch.setCurrentWh(value43);
						tSwitchMapper.addT43Switch(t43Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t43.getVoltage() !=null)&&(t43.getCurrent() !=null)&&(t43.getWh() !=null)&&(t43.getPower() !=null)) {
					t43.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT43Data(t43);
					//System.out.println("999999999999999999999999999");

					t43 .setPower(null);
					t43 .setCurrent(null);
					t43 .setVoltage(null);

					t43 .setWh(null);
				}

			}


			//只有满足上面的条件才能创建对象
			if(Integer.parseInt(param1) == 44){

				//t10.setCurrentDate(allWhls.get(i).getCurrentTime());
				if((param3.equals("V"))&&(param2.equals("sdm") )){
					/*System.out.println("777777");
					System.out.println(allWhls.get(i).getValue());*/
					t44.setVoltage(allWhls.get(i).getValue());
				}else if((param3.equals("A"))&&(param2.equals("sdm"))){
					t44.setCurrent(allWhls.get(i).getValue());

				}else if((param3.equals("W"))&&(param2.equals("sdm"))){
					t44.setPower(allWhls.get(i).getValue());

				}else if((param3.equals("Wh"))&&(param2.equals("sdm"))){
					value44 = allWhls.get(i).getValue();
					t44.setWh(allWhls.get(i).getValue());
					//单独创建每个设备的开关量表   然后存放开关量  表结构： id  开关量状态  时间  tid(设备id)
					// 当遍历到开关量的时候 如果状态没变化则不添加   状态变化 添加
				}else if(param2.equals("sw")){
					//存储状态值和时间  应该先获取到 存在数据库中的值状态值
					T44Switch t44Switch1 = tSwitchMapper.findT44Switch1();//为了获取最近存入的状态值
					/*System.out.println("55555555555555555555555555555");
					System.out.println(t10Switch1.getSwitchStatus());
					System.out.println(allWhls.get(i).getValue());
					System.out.println("55555555555555555555555555555");*/
					//如果取出的状态值和获取到的状态值不一样怎存储近数据库
					if(!t44Switch1.getSwitchStatus().equals(allWhls.get(i).getValue())){
						T44Switch t44Switch = new T44Switch();
						t44Switch.setLogTime(allWhls.get(i).getCurrentTime());
						t44Switch.setSwitchStatus(allWhls.get(i).getValue());
						t44Switch.setCurrentWh(value44);
						tSwitchMapper.addT44Switch(t44Switch);
					}
					//t10.setSwitch10(allWhls.get(i).getValue());
				}
				//if一次   处理当有的为空的时候也会添加加进去  统一时间不可能全部为获取到
				if((t44.getVoltage() !=null)&&(t44.getCurrent() !=null)&&(t44.getWh() !=null)&&(t44.getPower() !=null)) {
					t44.setTime1(allWhls.get(i).getCurrentTime());
					T10Mapper.addT44Data(t44);
					//System.out.println("999999999999999999999999999");

					t44 .setPower(null);
					t44 .setCurrent(null);
					t44 .setVoltage(null);

					t44 .setWh(null);
				}

			}






		}


	}
}






