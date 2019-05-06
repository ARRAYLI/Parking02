package com.arrayli.domain; 

public class SysInfo {
	private String os;    // 操作系统
	private String RunEnvironment;  //	运行环境
	private String version;	//	系统版本
	private String dateTime;  // 时间和日期
	private String ip;		// 服务器IP
	private String  host;	// 服务器主机名
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getRunEnvironment() {
		return RunEnvironment;
	}
	public void setRunEnvironment(String runEnvironment) {
		RunEnvironment = runEnvironment;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public String toString() {
		return "SysInfo [os=" + os + ", RunEnvironment=" + RunEnvironment + ", version=" + version + ", dateTime="
				+ dateTime + ", ip=" + ip + ", host=" + host + "]";
	}
	
}
 