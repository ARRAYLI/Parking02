package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.dao.impl.UserInfoDaoImpl;
import pers.arrayli.domain.UserInfo;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.UserInfoServiceImpl;


/**
 * @author lzj13
 *	�û�ע�� servlet
 */
public class UserRegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.��ǰ��ҳ���ȡ����
		String username = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		int age =Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		
		// 2.�ѻ�ȡ����ע����Ϣ��װ��һ���û���Ϣ����
		UserInfo user  = new UserInfo();
		user.setUsername(username);
		user.setPwd(pwd);
		user.setAge(age);
		user.setTel(tel);
		user.setMoney(0);
		System.out.println("Register user: "+user);
		
		// ��ȡ���������
		PrintWriter out = response.getWriter();
		try {
		
			// 3.����ҵ�����룬��������
			UserInfoService service = new UserInfoServiceImpl();
			boolean result = service.RegisterUser(user);
			// ���ע��ɹ�
			if(result){
				out.
		println("<script>alert('ע��ɹ����¼��');window.location.href='login.jsp'</script>");
				
			}else{ 		// ���ע��ʧ��
				out.
println("<script>alert('ע��ɹ�ʧ��,������ע�ᣡ');window.location.href='userinfo/regUserinfo.jsp'</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
