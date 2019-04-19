package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.service.AdminUserService;
import pers.arrayli.service.impl.AdminUserServiceImpl;


/**
 * @author lzj13
 *	ɾ������Ա��Ϣ servlet
 */
public class DelAdminServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡҪɾ���Ĺ���Ա id
			int  id = Integer.parseInt(request.getParameter("id"));
			
			// 2. ����ҵ��������������ͻ�������
			AdminUserService service = new AdminUserServiceImpl();
			boolean result = service.delAdminById(id);	
			// ɾ������Ա��Ϣ�ɹ�
			if(result){
				// �ض��� admin/list.jspҳ��
				response.sendRedirect("admin/list.jsp");
				
			}else{
				// ɾ������Աʧ��
				// ����޸�ʧ�ܵĻ�
				response.getWriter().
	println("<script>alert('ɾ������Ա��Ϣʧ�ܣ�');window.location.href='admin/list.jsp'</script>");		
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
