package com.zs.entity;

public class BaseRequsetVo {
	private String service;
	private String login_name;
	private String pid;
	private String sign;
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseRequsetVo [service=");
		builder.append(service);
		builder.append(", login_name=");
		builder.append(login_name);
		builder.append(", pid=");
		builder.append(pid);
		builder.append(", sign=");
		builder.append(sign);
		builder.append("]");
		return builder.toString();
	}
	
	

}
