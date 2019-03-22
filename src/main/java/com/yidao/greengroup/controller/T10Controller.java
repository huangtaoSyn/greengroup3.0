package com.yidao.greengroup.controller;

import com.yidao.greengroup.dao.T10Mapper;
import com.yidao.greengroup.dao.TSwitchMapper;
import com.yidao.greengroup.po.Enginer.*;

import com.yidao.greengroup.po.MessageR.*;
import com.yidao.greengroup.po.ResultDevice;
import com.yidao.greengroup.po.ReviceData;
import com.yidao.greengroup.service.T10Service;
import com.yidao.greengroup.service.TSwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableScheduling
@RestController
public class T10Controller {

	@Autowired
	T10Service t10Service1;
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
    @Autowired
	TSwitchService tSwitchService;
    @Autowired
	TSwitchMapper tSwitchMapper;
    @Autowired
	T10Mapper t10Mapper;

	ReviceData data =  new ReviceData();
	public  String id ;

	public String did;
	public String pid;


	@Scheduled(fixedRate = 1000)  //按照固定周期执行  这里为每隔1秒执行一次  ，
	@SendTo("/topic/callback")
	public Object callback() throws Exception {
		String flags = this.getId();
		String flags1 = this.getDid();//获取基地id
		String flags2 = this.getPid();//获取生产线id
		if((flags != null) ||(flags1!=null)||(flags2!=null)) {
			if ("10".equals(flags)) {
				T10 t10Data = t10Service1.findT10Data();
				List<T10Switch> t10Switch = tSwitchService.findT10Switch();
				MessageResult10 messageResult10 = new MessageResult10(t10Data, t10Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult10);//发送数据
			}else if ("11".equals(flags)) {
				T11 t11Data = t10Service1.findT11Data();
				List<T11Switch> t11Switch = tSwitchService.findT11Switch();
				MessageResult11 messageResult11 = new MessageResult11(t11Data,t11Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult11);//发送数据
			} else if ("15".equals(flags)) {
				T15 t15Data = t10Service1.findT15Data();
				List<T15Switch> t15Switch = tSwitchService.findT15Switch();
				MessageResult15 messageResult15 = new MessageResult15(t15Data, t15Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult15);//发送数据
			}else if ("16".equals(flags)) {
				T16 t16Data = t10Service1.findT16Data();
				List<T16Switch> t16Switch = tSwitchService.findT16Switch();
				MessageResult16 messageResult16 = new MessageResult16(t16Data, t16Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult16);//发送数据
			}else if ("17".equals(flags)) {
				T17 t17Data = t10Service1.findT17Data();
				List<T17Switch> t17Switch = tSwitchService.findT17Switch();
				MessageResult17 messageResult17 = new MessageResult17(t17Data, t17Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult17);//发送数据
			}else if ("18".equals(flags)) {
				T18 t18Data = t10Service1.findT18Data();
				List<T18Switch> t18Switch = tSwitchService.findT18Switch();
				MessageResult18 messageResult18 = new MessageResult18(t18Data, t18Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult18);//发送数据
			} else if ("19".equals(flags)) {
				T19 t19Data = t10Service1.findT19Data();
				List<T19Switch> t19Switch = tSwitchService.findT19Switch();
				MessageResult19 messageResult19 = new MessageResult19(t19Data, t19Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult19);//发送数据
			} else if ("21".equals(flags)) {
				T21 t21Data = t10Service1.findT21Data();
				List<T21Switch> t21Switch = tSwitchService.findT21Switch();
				MessageResult21 messageResult21 = new MessageResult21(t21Data, t21Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult21);//发送数据
			} else if ("22".equals(flags)) {
				T22 t22Data = t10Service1.findT22Data();
				List<T22Switch> t22Switch = tSwitchService.findT22Switch();
				MessageResult22 messageResult22 = new MessageResult22(t22Data, t22Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult22);//发送数据
			} else if ("24".equals(flags)) {
				T24 t24Data = t10Service1.findT24Data();
				List<T24Switch> t24Switch = tSwitchService.findT24Switch();
				MessageResult24 messageResult24 = new MessageResult24(t24Data, t24Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult24);//发送数据
			} else if ("26".equals(flags)) {
				T26 t26Data = t10Service1.findT26Data();
				List<T26Switch> t26Switch = tSwitchService.findT26Switch();
				MessageResult26 messageResult26 = new MessageResult26(t26Data, t26Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult26);//发送数据
			} else if ("27".equals(flags)) {
				T27 t27Data = t10Service1.findT27Data();
				List<T27Switch> t27Switch = tSwitchService.findT27Switch();
				MessageResult27 messageResult27 = new MessageResult27(t27Data, t27Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult27);//发送数据
			} else if ("28".equals(flags)) {
				T28 t28Data = t10Service1.findT28Data();
				List<T28Switch> t28Switch = tSwitchService.findT28Switch();
				MessageResult28 messageResult28 = new MessageResult28(t28Data, t28Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult28);//发送数据
			} else if ("29".equals(flags)) {
				T29 t29Data = t10Service1.findT29Data();
				List<T29Switch> t29Switch = tSwitchService.findT29Switch();
				MessageResult29 messageResult29 = new MessageResult29(t29Data, t29Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult29);//发送数据
			} else if ("30".equals(flags)) {
				T30 t30Data = t10Service1.findT30Data();
				List<T30Switch> t30Switch = tSwitchService.findT30Switch();
				MessageResult30 messageResult30 = new MessageResult30(t30Data, t30Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult30);//发送数据
			} else if ("40".equals(flags)) {
				T40 t40Data = t10Service1.findT40Data();
				List<T40Switch> t40Switch = tSwitchService.findT40Switch();
				MessageResult40 messageResult40 = new MessageResult40(t40Data, t40Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult40);//发送数据
			} else if ("41".equals(flags)) {
				T41 t41Data = t10Service1.findT41Data();
				List<T41Switch> t41Switch = tSwitchService.findT41Switch();
				MessageResult41 messageResult41 = new MessageResult41(t41Data, t41Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult41);//发送数据
			} else if ("42".equals(flags)) {
				T42 t42Data = t10Service1.findT42Data();
				List<T42Switch> t42Switch = tSwitchService.findT42Switch();
				MessageResult42 messageResult42 = new MessageResult42(t42Data, t42Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult42);//发送数据
			} else if ("43".equals(flags)) {
				T43 t43Data = t10Service1.findT43Data();
				List<T43Switch> t43Switch = tSwitchService.findT43Switch();
				MessageResult43 messageResult43 = new MessageResult43(t43Data, t43Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult43);//发送数据
			} else if ("44".equals(flags)) {
				T44 t44Data = t10Service1.findT44Data();
				List<T44Switch> t44Switch = tSwitchService.findT44Switch();
				MessageResult44 messageResult44 = new MessageResult44(t44Data, t44Switch);
				messagingTemplate.convertAndSend("/topic/callback", messageResult44);//发送数据
			}else{
				//获取此时的设备
				List<ResultDevice> definedData = tSwitchMapper.findDefinedData(Integer.parseInt(this.getDid()), Integer.parseInt(this.getPid()));
				messagingTemplate.convertAndSend("/topic/callback", definedData);//发送数据
			}
		}
		//System.out.println("执行了");
		return "callback";
	}
//  获取从浏览器传递来的值
	@MessageMapping("/send")
	@SendTo("/topic/send")
	public ReviceData send(ReviceData message) throws Exception {
		 this.setId(message.getId());
		 this.setDid(message.getDid());//获取基地id
		 this.setPid(message.getPid());
		//System.out.println("message的值"+message);  //已经获取了  message的值ReviceData{id='null', did='49', pid='8'}
		return message;
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}


	@RequestMapping("/final/findT10Switch.do")
	public List<T10Switch> findT10Switch(){
		return tSwitchMapper.findT10Switch();
	}
	@RequestMapping("/final/findT11Switch.do")
	public List<T11Switch> findT11Switch(){
		return  tSwitchMapper.findT11Switch();
	}
	@RequestMapping("/final/findT15Switch.do")
	public List<T15Switch> findT15Switch(){
		return  tSwitchMapper.findT15Switch();
	}
	@RequestMapping("/final/findT16Switch.do")
	public List<T16Switch> findT16Switch(){
		return  tSwitchMapper.findT16Switch();
	}
	@RequestMapping("/final/findT17Switch.do")
	public List<T17Switch> findT17Switch(){
		return  tSwitchMapper.findT17Switch();
	}
	@RequestMapping("/final/findT18Switch.do")
	public List<T18Switch> findT18Switch(){
		return  tSwitchMapper.findT18Switch();
	}
	@RequestMapping("/final/findT19Switch.do")
	public List<T19Switch> findT19Switch(){
		return  tSwitchMapper.findT19Switch();
	}
	@RequestMapping("/final/findT21Switch.do")
	public List<T21Switch> findT21Switch(){
		return  tSwitchMapper.findT21Switch();
	}
	@RequestMapping("/final/findT22Switch.do")
	public List<T22Switch> findT22Switch(){
		return  tSwitchMapper.findT22Switch();
	}
	@RequestMapping("/final/findT24Switch.do")
	public List<T24Switch> findT24Switch(){
		return  tSwitchMapper.findT24Switch();
	}
	@RequestMapping("/final/findT26Switch.do")
	public List<T26Switch> findT26Switch(){
		return  tSwitchMapper.findT26Switch();
	}
	@RequestMapping("/final/findT27Switch.do")
	public List<T27Switch> findT27Switch(){
		return  tSwitchMapper.findT27Switch();
	}
	@RequestMapping("/final/findT28Switch.do")
	public List<T28Switch> findT28Switch(){
		return  tSwitchMapper.findT28Switch();
	}
	@RequestMapping("/final/findT29Switch.do")
	public List<T29Switch> findT29Switch(){
		return  tSwitchMapper.findT29Switch();
	}
	@RequestMapping("/final/findT30Switch.do")
	public List<T30Switch> findT30Switch(){
		return  tSwitchMapper.findT30Switch();
	}
	@RequestMapping("/final/findT40Switch.do")
	public List<T40Switch> findT40Switch(){
		return  tSwitchMapper.findT40Switch();
	}
	@RequestMapping("/final/findT41Switch.do")
	public List<T41Switch> findT41Switch(){
		return  tSwitchMapper.findT41Switch();
	}
	@RequestMapping("/final/findT42Switch.do")
	public List<T42Switch> findT42Switch(){
		return  tSwitchMapper.findT42Switch();
	}
	@RequestMapping("/final/findT43Switch.do")
	public List<T43Switch> findT43Switch(){
		return  tSwitchMapper.findT43Switch();
	}
	@RequestMapping("/final/findT44Switch.do")
	public List<T44Switch> findT44Switch(){
		return  tSwitchMapper.findT44Switch();
	}




	@RequestMapping("/findT10SwitchByTime.do")
	public List<T10Switch> findT10SwitchByTime(){
		//System.out.println("4444444");
		//System.out.println(tSwitchMapper.findT10Switch11());
		return tSwitchMapper.findT10Switch11();
	}

	@RequestMapping("/findT11SwitchByTime.do")
	public List<T11Switch> findT11SwitchByTime(){

		return tSwitchMapper.findT11Switch11();
	}
	@RequestMapping("/findT15SwitchByTime.do")
	public List<T15Switch> findT15SwitchByTime(){

		return tSwitchMapper.findT15Switch11();
	}
	@RequestMapping("/findT16SwitchByTime.do")
	public List<T16Switch> findT16SwitchByTime(){

		return tSwitchMapper.findT16Switch11();
	}
	@RequestMapping("/findT17SwitchByTime.do")
	public List<T17Switch> findT17SwitchByTime(){

		return tSwitchMapper.findT17Switch11();
	}
	@RequestMapping("/findT18SwitchByTime.do")
	public List<T18Switch> findT18SwitchByTime(){

		return tSwitchMapper.findT18Switch11();
	}
	@RequestMapping("/findT19SwitchByTime.do")
	public List<T19Switch> findT19SwitchByTime(){

		return tSwitchMapper.findT19Switch11();
	}
	@RequestMapping("/findT21SwitchByTime.do")
	public List<T21Switch> findT21SwitchByTime(){

		return tSwitchMapper.findT21Switch11();
	}
	@RequestMapping("/findT22SwitchByTime.do")
	public List<T22Switch> findT22SwitchByTime(){

		return tSwitchMapper.findT22Switch11();
	}
	@RequestMapping("/findT24SwitchByTime.do")
	public List<T24Switch> findT24SwitchByTime(){

		return tSwitchMapper.findT24Switch11();
	}
	@RequestMapping("/findT26SwitchByTime.do")
	public List<T26Switch> findT26SwitchByTime(){

		return tSwitchMapper.findT26Switch11();
	}
	@RequestMapping("/findT27SwitchByTime.do")
	public List<T27Switch> findT27SwitchByTime(){

		return tSwitchMapper.findT27Switch11();
	}
	@RequestMapping("/findT28SwitchByTime.do")
	public List<T28Switch> findT28SwitchByTime(){

		return tSwitchMapper.findT28Switch11();
	}
	@RequestMapping("/findT29SwitchByTime.do")
	public List<T29Switch> findT29SwitchByTime(){

		return tSwitchMapper.findT29Switch11();
	}
	@RequestMapping("/findT30SwitchByTime.do")
	public List<T30Switch> findT30SwitchByTime(){

		return tSwitchMapper.findT30Switch11();
	}
	@RequestMapping("/findT40SwitchByTime.do")
	public List<T40Switch> findT40SwitchByTime(){

		return tSwitchMapper.findT40Switch11();
	}
	@RequestMapping("/findT41SwitchByTime.do")
	public List<T41Switch> findT41SwitchByTime(){

		return tSwitchMapper.findT41Switch11();
	}
	@RequestMapping("/findT42SwitchByTime.do")
	public List<T42Switch> findT42SwitchByTime(){

		return tSwitchMapper.findT42Switch11();
	}
	@RequestMapping("/findT43SwitchByTime.do")
	public List<T43Switch> findT43SwitchByTime(){

		return tSwitchMapper.findT43Switch11();
	}
	@RequestMapping("/findT44SwitchByTime.do")
	public List<T44Switch> findT44SwitchByTime(){

		return tSwitchMapper.findT44Switch11();
	}

	/*@RequestMapping("/findPage2.do")
	public PageResult findPage(int page, int rows){
		return T10Service.findPage2(page, rows);
	}*/
}
