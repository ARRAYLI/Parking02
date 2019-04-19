package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.AdminUser;
import pers.arrayli.service.AdminUserService;
import pers.arrayli.service.impl.AdminUserServiceImpl;


/**
 * @author lzj13
 *	��ӹ���Ա��Ϣ
 */
public class AddAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			// 1. ��ȡ�ͻ�������
			String userName = request.getParameter("name");
			String userPassword = request.getParameter("pwd");
			
			// 2. �����ݷ�װ��һ�� AdminUser����
			AdminUser admin = new AdminUser();
			admin.setUserName(userName);
			admin.setUserPassword(userPassword);
			
			// 3.����ҵ����������������
			AdminUserService service = new AdminUserServiceImpl();
			boolean result = service.addAdmin(admin);
			// �����ӹ���Ա��Ϣ�ɹ�
			if(result){
				// �����ӳɹ����ض���  ����list.jsp
				//response.sendRedirect("che/list.jsp");
			}else{
				// ������ʧ��
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
