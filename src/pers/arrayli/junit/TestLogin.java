package pers.arrayli.junit;

import static org.junit.Assert.*;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import pers.arrayli.utils.SysInfoUtils;

public class TestLogin {

	/**
	 *  ���Ի�ȡϵͳ��Ϣ
	 * @throws UnknownHostException 
	 */
	@Test
	public void testSysInfo() throws UnknownHostException {
		// ��ӡϵͳ��Ϣ
		System.out.println("����ϵͳ��"+ "WIN10");
		System.out.println("���л�����"+"Apache Tomcat");
		System.out.println("�汾��"+ "version-1.0");
		Date date  = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		System.out.println("����ʱ�䣺 "+ time);
		System.out.println("����������/IP�� "+SysInfoUtils.getIP());
		System.out.println("Host��"+SysInfoUtils.getHost());
		System.out.println("����֧��");
	}

}
 