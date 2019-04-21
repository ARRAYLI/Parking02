package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheWei;
import pers.arrayli.service.CheWeiService;
import pers.arrayli.service.impl.CheWeiServiceImpl;


/**
 * @author lzj13
 *	��ӳ�λ��Ϣ
 */
public class AddCheweiServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡ��λ��Ϣ����
			String hao = request.getParameter("hao");
			String quyu = request.getParameter("qu");
			String info = request.getParameter("info");
			
			// 2.�ѳ�λ��Ϣ��װ��һ�� CheWei ����
			CheWei cheWei = new CheWei();
			cheWei.setHao(hao);
			cheWei.setQuyu(quyu);
			cheWei.setInfo(info);
			cheWei.setId(0);
			cheWei.setChepai(null);
			cheWei.setAdate(null);
			
			System.out.println("��ӵĳ�λ��Ϣ��"+cheWei.toString());
			
			
			// 3.ִ��ҵ����������������
			CheWeiService service = new CheWeiServiceImpl();
			boolean result = service.AddCheWei(cheWei);
			// �����ӳ�λ��Ϣ�ɹ�
			if(result){
				response.sendRedirect("chewei/list.jsp");	
			}else{
				// �����ӳ�λ��Ϣʧ��
				// �������ʧ��
				response.getWriter()
.println("<script>alert('��ӳ�λ��Ϣʧ�ܣ�');window.location.href='chewei/list.jsp'</script>");
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
