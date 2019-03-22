package com.yidao.greengroup.po.Enginer;

import java.util.Date;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-12 11:47
 * @version: $version$
 */


public class T24Switch {
	public int sid ;
	public Date logTime  ;
	public  String  switchStatus;
	public String currentWh;
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getSwitchStatus() {
		return switchStatus;
	}

	public void setSwitchStatus(String switchStatus) {
		this.switchStatus = switchStatus;
	}

	public String getCurrentWh() {
		return currentWh;
	}

	public void setCurrentWh(String currentWh) {
		this.currentWh = currentWh;
	}
}
