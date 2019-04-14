package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import pers.arrayli.domain.AdminUser;
import pers.arrayli.domain.SysInfo;
import pers.arrayli.domain.UserInfo;

import pers.arrayli.dao.AdminUserDao;
import pers.arrayli.service.AdminUserService;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.AdminUserServiceImpl;
import pers.arrayli.service.impl.UserInfoServiceImpl;
import pers.arrayli.utils.SysInfoUtils;

/**
 * Servlet implementation class LoginServlet
 */
/**
 * @author lzj13 �û���¼��
 */
public class LoginServlet extends HttpServlet  {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 1. ��jspҳ���ȡ�ύ����������
		String username = request.getParameter("username");
		String password = request.getParameter("userpwd");
		String type = request.getParameter("type");
		
		// ��ӡ��¼��Ϣ
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("type = " + type);
	
	
		Date date  = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		System.out.println("---------------------1-----------------");
		SysInfo sysinfo = new SysInfo();
		System.out.println("---------------------2-----------------");
		sysinfo.setOs(SysInfoUtils.os);
		System.out.println("---------------------3-----------------");
		String hoString = SysInfoUtils.getHost();
		System.out.println("host: "+hoString);
		sysinfo.setHost(SysInfoUtils.getHost());
		System.out.println("---------------------4-----------------");
		sysinfo.setIp(SysInfoUtils.getIP());
		System.out.println("---------------------5-----------------");
		sysinfo.setRunEnvironment(SysInfoUtils.RunEnvironment);
		System.out.println("---------------------6-----------------");
		sysinfo.setVersion(SysInfoUtils.version);
		System.out.println("---------------------7-----------------");
		sysinfo.setDateTime(time);
		System.out.println("---------------------2-----------------");
		// ����ϵͳ��Ϣ
		request.setAttribute("sysinfo", sysinfo);	
		System.out.println("---------------------3-----------------");
		// ��ȡ���������
		PrintWriter out = response.getWriter();
	
		// 2.�����ύ������ type���ж��ǹ���Ա��¼������ͨ�û���¼
		if ("�û�".equals(type)) {
			// 3. �����ݿ��в��Ҳ����û�,��֤����Ա�û��Ƿ����
			try {
			
				// 3. �����ݿ��в��Ҳ����û�
				UserInfoService service = new UserInfoServiceImpl();
				// ����ҵ��㷽������֤��¼
				boolean LoginResult = service.login(username,password);
				
				// �����¼�ɹ��Ļ����ض��򵽺�̨����ҳ
				if(LoginResult){
					
					response.sendRedirect("index.jsp");
				}else{
					// �����¼ʧ�ܵĻ�
					out.println("<script>alert('�û�������������');window.location.href='login.jsp'</script>");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if ("����Ա".equals(type)) {
			// 3. �����ݿ��в��Ҳ����û�,��֤����Ա�û��Ƿ����
			try {
			
				// 3. �����ݿ��в��Ҳ����û�
				AdminUserService service = new AdminUserServiceImpl();
				// ����ҵ��㷽������֤��¼
				boolean LoginResult = service.login(username,password);
				
				// �����¼�ɹ��Ļ����ض��򵽺�̨����ҳ
				if(LoginResult){
					response.sendRedirect("index.jsp");
				}else{
					// �����¼ʧ�ܵĻ�
					out.println("<script>alert('�û�������������');window.location.href='login.jsp'</script>");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			// �����¼ʧ�ܵĻ�
			out.println("<script>alert('�û�������������');window.location.href='login.jsp'</script>");
		}
		
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
