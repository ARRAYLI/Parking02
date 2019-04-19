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
 *	�޸Ĺ���Ա��Ϣ
 */
public class ModAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ǰ��ҳ���ȡ����Ա��Ϣ
			
			int id = Integer.parseInt(request.getParameter("id"));
			String userName = request.getParameter("name");
			String passWord = request.getParameter("pwd");
			
			// 2.�ѻ�ȡ������Ϣ��װ��һ�� AdminUser����
			AdminUser admin = new  AdminUser();
			admin.setUserName(userName);
			admin.setUserPassword(passWord);
			System.out.println("id: "+id+"\tadmin: "+admin.toString());
			
			// 3.ҵ��㴦��ǰ��ҳ������
			AdminUserService service = new AdminUserServiceImpl();
			boolean result = service.updateAdminById(id, admin);
			// ����޸ĳɹ��Ļ�
			if(result){
				// �ض��� admin/list.jsp
				response.sendRedirect("admin/list.jsp");
			}else{
					// ����޸�ʧ�ܵĻ�
				// ����޸�ʧ�ܵĻ�
				response.getWriter().println("<script>alert('�޸Ĺ���Ա��Ϣʧ�ܣ�');window.location.href='admin/list.jsp'</script>");
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
