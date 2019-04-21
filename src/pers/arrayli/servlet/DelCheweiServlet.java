package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.service.CheWeiService;
import pers.arrayli.service.impl.CheWeiServiceImpl;


/**
 * @author lzj13
 *	ɾ����λ��Ϣ servlet
 */
public class DelCheweiServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡɾ����λ��Ϣ�ĳ�λ id
			int id = Integer.parseInt(request.getParameter("id"));
			
			// 2.ͨ��ҵ��������ִ������
			CheWeiService service = new CheWeiServiceImpl();
			boolean result = service.DelCheWeiById(id);
			// ���ɾ���ɹ�
			if(result){
				response.sendRedirect("chewei/list.jsp");	
			}else{
				// ���ɾ��ʧ��
				// �������ʧ��
				response.getWriter()
	.println("<script>alert('ɾ����λ��Ϣʧ�ܣ�');window.location.href='chewei/list.jsp'</script>");
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
