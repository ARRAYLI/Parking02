package pers.arrayli.servlet;

import java.io.IOException;
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
 *	����û���Ϣ servlet
 */
public class AddUserInfoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡǰ��ҳ�������
			String username = request.getParameter("name");
			String password = request.getParameter("pwd");
			int age = Integer.parseInt(request.getParameter("age"));
			String tel = request.getParameter("tel");
			
			// 2.�ѻ�ȡ�����û���Ϣ��װ��һ�� UserInfo ����
			UserInfo user = new UserInfo();
			user.setUsername(username);
			user.setPwd(password);
			user.setAge(age);
			user.setTel(tel);
			
			// 3.ִ��ҵ������
			UserInfoService service = new UserInfoServiceImpl();
			boolean result = service.addUserInfo(user);
			// �������û���Ϣ�ɹ�
			if(result){
				// �ض���   userinfo/list.jsp
				response.sendRedirect("userinfo/list.jsp");
			}else{
				// �������û���Ϣʧ��
				response.getWriter()
.println("<script>alert('����û���Ϣʧ�ܣ�');window.location.href='userinfo/list.jsp'</script>");
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
