package pers.arrayli.domain; 

public class SysInfo {
	private String os;    // ����ϵͳ
	private String RunEnvironment;  //	���л���
	private String version;	//	ϵͳ�汾
	private String dateTime;  // ʱ�������
	private String ip;		// ������IP
	private String  host;	// ������������
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
 