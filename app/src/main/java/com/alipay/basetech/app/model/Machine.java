package com.alipay.basetech.app.model;

import com.alipay.basetech.crud.annotation.TableName;

@TableName("machine_info")
public class Machine {

	private long id;
	private String ip;
	private String hostname;
	private int isUsed;
	private String curApp;
	private String idc;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public String getCurApp() {
		return curApp;
	}

	public void setCurApp(String curApp) {
		this.curApp = curApp;
	}

	public String getIdc() {
		return idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
