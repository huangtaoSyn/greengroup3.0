package com.yidao.greengroup.po;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-14 6:42
 * @version: $version$
 */

public class ReviceData {
	public String id;


	public String did;
	public String pid;
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

	@Override
	public String toString() {
		return "ReviceData{" +
				"id='" + id + '\'' +
				", did='" + did + '\'' +
				", pid='" + pid + '\'' +
				'}';
	}
}
