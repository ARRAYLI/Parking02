package pers.arrayli.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.tomcat.jni.OS;

/**
 * @author lzj13
 *	��ȡ��������IP��ַ��Host
 */
public class SysInfoUtils {
	public static String os = "WIN10";    // ����ϵͳ
	public static String RunEnvironment = "Apache Tomcat";  //	���л���
	public static String version = "version-1.0";	//	ϵͳ�汾
	public static InetAddress addr = null; 
	/**	��ȡ��������IP��ַ
	 * @return ���ط������� IP��ַ
	 * @throws UnknownHostException
	 */
	public static String getIP() throws UnknownHostException{
		addr = InetAddress.getLocalHost();
		String ip = addr.getHostAddress();
		System.out.println("ip : "+ip);
		return ip;
	}
	
	public static String getHost(){
		String host = addr.getHostName();
		System.out.println("host: "+host);
		return host;
	}
}  
	
 