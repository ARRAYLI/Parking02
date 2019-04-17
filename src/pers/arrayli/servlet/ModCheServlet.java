package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import pers.arrayli.domain.Che;
import pers.arrayli.service.CheService;
import pers.arrayli.service.impl.CheServiceImpl;

/**
 * @author lzj13 �޸ĳ�����Ϣservlet
 */
public class ModCheServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ���������
		PrintWriter out = response.getWriter();

		try {
			// 1.��ǰ��ҳ���ȡ�ύ����������
			int id = Integer.parseInt(request.getParameter("id"));
			String hao = request.getParameter("hao");
			String leixing = request.getParameter("leixing");
			String picture = request.getParameter("fujian");
			String info = request.getParameter("info");

			// 2.����һ��Javabean ����
			Che che = new Che();
			che.setId(id);
			che.setHao(hao);
			che.setLeixing(leixing);
			che.setPicture(picture);
			che.setInfo(info);

			// 3.����ҵ��������д���
			CheService service = new CheServiceImpl();
			boolean result = service.updateCheById(id, che);
			// ����޸ĳɹ��Ļ�
			if (result) {
				// �����ӳɹ����ض��� ����list.jsp
				response.sendRedirect("che/list.jsp");
			} else {
				// ����޸�ʧ�ܵĻ�
				out.println("<script>alert('�޸ĳ�����Ϣʧ�ܣ�');window.location.href='che/list.jsp'</script>");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		out.flush();
		out.close();
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
