package pers.arrayli.junit;

import static org.junit.Assert.*;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import pers.arrayli.utils.CalculateTime;
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

	@Test
	public void testTimeDiff(){
		String date1 = "2019-04-20 10:00:00";
		String date2 = "2019-04-21 12:30:52";
		long diff =Long.parseLong(CalculateTime.CalculateTime(date1, date2));
		diff = diff / 1000;   //�������
		// �������
		int day =(int) (diff / 60 / 60 /24);
		int hour = (int)(diff / 60 / 60);
		int temp = ((int)(diff / 60)) % 60;
		System.out.println("temp = "+temp);
		if(temp != 0){
			hour = hour + 1;
		}
		System.out.println(date2+" ��  "+date1+" ��ʱ�����ǣ�"+diff);
		System.out.println("���   "+day+" ��");
		System.out.println("���  "+ hour+" Сʱ");
		
		
	}
}
 