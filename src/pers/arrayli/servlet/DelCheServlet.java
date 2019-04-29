package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.service.CheService;
import pers.arrayli.service.impl.CheServiceImpl;
import pers.arrayli.utils.PictureUtils;
import pers.arrayli.utils.SysInfoUtils;

/**
 * @author lzj13 ɾ��������Ϣ servlet
 */
public class DelCheServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("----------------- DelCheServlet Debug Start -------------------");
		try {
			// 1.��ȡҪɾ���ĳ�����Ϣ�� id
			int id = Integer.parseInt(request.getParameter("id"));
			
			CheService service = new CheServiceImpl();
			// 2.ɾ������ͼƬ��Ϣ
			// a.�Ȼ�ȡҪɾ����ͼƬ·��

			String delPicPath = PictureUtils.PicPath;
			// ��ȡͼƬ����
			String fileName = service.getPicPathById(id);
			if (fileName != null) {

				String[] array = fileName.split("/");
				System.out.println("delPicPath: " + delPicPath + "\tfileName: " + fileName);

				for (String t : array) {
					System.out.println(t);
				}
				fileName = array[2];
				fileName = delPicPath + "\\" + fileName;
				System.out.println("fileName: " + fileName);

				PictureUtils.delPicture(fileName);
				System.out.println("----------------- DelCheServlet Debug End -------------------");
			}
			
			// 3.ִ��ҵ������
			
		    boolean result = service.delCheById(id);
			// ���ɾ���ɹ��Ļ�
			if (result) {
				// �ض��� list.jsp
				response.sendRedirect("che/list.jsp");
			} else {
				// ɾ��ʧ�ܵĻ�

				// ��ȡ���������
				PrintWriter out = response.getWriter();
				out.println("<script>alert('ɾ��������Ϣʧ�ܣ�');window.location.href='che/list.jsp'</script>");
				out.flush();
				out.close();
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
