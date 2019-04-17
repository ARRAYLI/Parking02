package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.Che;
import pers.arrayli.service.CheService;
import pers.arrayli.service.impl.CheServiceImpl;

/**
 * Servlet implementation class AddCheServlet
 */
public class AddCheServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// 1.��ǰ��ҳ���ȡ����
			String hao = request.getParameter("hao");
			String leixing = request.getParameter("leixing");
			String picture = request.getParameter("fujian");
			String info = request.getParameter("info");
			int uid = Integer.parseInt(request.getSession().getAttribute("uid").toString());

			System.out.println("-------------------��ӳ�����Ϣ---------------");
			

			// 2.��װ����Ϣ
			Che che = new Che();
			che.setHao(hao);
			che.setLeixing(leixing);
			che.setInfo(info);
			che.setPicture(picture);
			che.setUid(uid);
			
			System.out.println(che.toString());
			System.out.println("-------------------��ӳ�����Ϣ---------------");
			
			// 3.����ҵ���������ѳ�����Ϣд�����ݿ���
			CheService service = new CheServiceImpl();
			boolean result = service.AddChe(che);
			System.out.println("AddCheServlet: result ="+result);
			// �����ӳɹ�
			if(result){
				// �����ӳɹ����ض���  ����list.jsp
				response.sendRedirect("che/list.jsp");
			}else{
				// �����¼ʧ�ܵĻ�
				// ��ȡ���������
				PrintWriter out = response.getWriter();
				out.println("<script>alert('��ӳ���ʧ�ܣ�');window.location.href='che/list.jsp'</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
