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
 *	�޸ĳ�λ��Ϣ servlet
 */
public class ModCheweiServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			// 1.��ȡҪ�޸ĵĳ�λ��Ϣ id
			int id = Integer.parseInt(request.getParameter("id"));
			String hao = request.getParameter("hao");
			String quyu = request.getParameter("quyu");
			String info = request.getParameter("info");
			
			// 2. �ѳ�λ��Ϣ��װ��һ�� CheWei ����
			CheWei cheWei = new CheWei();
			cheWei.setHao(hao);
			cheWei.setInfo(info);
			cheWei.setQuyu(quyu);
			
			// 3.����ҵ�����봦������
			CheWeiService service = new CheWeiServiceImpl();
			boolean result = service.updateCheWeiById(id, cheWei);
			// ������³ɹ�
			if(result){
				response.sendRedirect("chewei/list.jsp");	
			}else{
				// �������ʧ��
				response.getWriter()
	.println("<script>alert('���³�λ��Ϣʧ�ܣ�');window.location.href='chewei/list.jsp'</script>");
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
