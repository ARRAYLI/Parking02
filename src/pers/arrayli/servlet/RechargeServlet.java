package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheFeiPrice;
import pers.arrayli.domain.UserInfo;
import pers.arrayli.service.CheFeiPriceService;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.CheFeiPriceServiceImpl;
import pers.arrayli.service.impl.UserInfoServiceImpl;


/**
 * @author lzj13
 *	��ֵ servlet   ��Ҫ��������jspҳ��ĳ�ֵ����
 */
public class RechargeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡ����
			int id = Integer.parseInt(request.getParameter("id"));
			int money = Integer.parseInt(request.getParameter("money"));
			// 3.ͨ��ҵ�������������д���
			UserInfoService service = new UserInfoServiceImpl();
			boolean result = service.UserRecharge(id, money);
			// �����ֵ�ɹ�
			if(result){
				
				response.getWriter()
	.println("<script>alert('��ֵ�ɹ���');window.location.href='userinfo/list.jsp'</script>");
				// �����ӳɹ����ض���  userinfo/list.jsp
				//response.sendRedirect("userinfo/list.jsp");
			}else{
				// �����ֵʧ��
				response.getWriter()
	.println("<script>alert('��ֵʧ�ܣ�');window.location.href='userinfo/list.jsp'</script>");
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
