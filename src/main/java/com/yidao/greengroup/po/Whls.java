package com.yidao.greengroup.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-11 2:49
 * @version: $version$
 */

public class Whls {
	public int id;
	public Date currentTime;
	public String topic;
	public String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Whls{" +
				"id=" + id +
				", currentTime=" + currentTime +
				", topic='" + topic + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
