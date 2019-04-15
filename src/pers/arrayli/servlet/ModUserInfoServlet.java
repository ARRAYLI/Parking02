package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.UserInfo;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.UserInfoServiceImpl;


/**
 * @author lzj13
 *	�޸��û���Ϣservlet
 */
public class ModUserInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡ�޸ĺ���û���Ϣ
			
			int id = Integer.parseInt(request.getParameter("id"));
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			int age = Integer.parseInt(request.getParameter("age"));
			String tel = request.getParameter("tel");
			System.out.println("�޸ĺ���û���ϢΪ�� id = "+id+" username= "+username+"  password = "+password+" age = "+age+" tel = "+tel);
			
			// 2.��ҵ���������ݴ������
			UserInfoService service = new UserInfoServiceImpl();
			UserInfo user  = new UserInfo();
			user.setId(id);
			user.setUsername(username);
			user.setPwd(password);
			user.setAge(age);
			user.setTel(tel);
			service.update(id, user);
		
			// ��ȡ���������
			PrintWriter out = response.getWriter();
			
			// ��ȡ�û����ͣ��жϵ�¼�û���Ϊ��
			String type = request.getParameter("type");
			
			// �������ͨ�û�ִ��
			if(type != null && type.length() >0){
				out.
println("<script>alert('�޸ĳɹ���');window.location.href='userinfo/myUserinfo.jsp'</script>");
			}else{	
				// ����ǹ���Ա�û��ض��� list.jsp
				response.sendRedirect("userinfo/list.jsp");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
