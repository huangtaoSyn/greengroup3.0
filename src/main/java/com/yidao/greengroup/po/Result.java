package com.yidao.greengroup.po;/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-07 23:06
 * @version: $version$
 */


public class Result {
	public boolean success;
	public String info;
	public String message;

	public Result(boolean success, String info) {
		this.success = success;
		this.info = info;
	}

	public Result(boolean success, String info, String message) {
		this.success = success;
		this.info = info;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Result{" +
				"success=" + success +
				", info='" + info + '\'' +
				'}';
	}
}
