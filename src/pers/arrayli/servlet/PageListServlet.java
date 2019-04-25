package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheFei;
import pers.arrayli.domain.PageBean;
import pers.arrayli.service.CheFeiService;
import pers.arrayli.service.impl.CheFeiServiceImpl;


/**
 * @author lzj13
 *	��ҳ��ʾ
 */	
public class PageListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--------------PageListServlet Debug Start-------------------------");
		try {
			// 1.��ȡ��Ҫ��ʾ��ҳ��
			int currentPage = Integer.parseInt(request.getParameter("currentPage"));
			
			// ��ȡ��ѯ����
			String chepai = request.getParameter("chepai");			// ���ƺ�
			String jdate = request.getParameter("jdate");			// �볡ʱ��
			System.out.println("chepai: "+chepai+"\tjdate: "+jdate);
			System.out.println("currentPage: "+currentPage);
			// 2.����ָ����ҳ��ȥ��ȡ��ҳ�����ݻ���
			CheFeiService service  = new CheFeiServiceImpl();
			PageBean pageBean =  service.findCheFeiByPage(currentPage,chepai,jdate);
			System.out.println("pageBean.getCurrentPage(): "+pageBean.getCurrentPage());
			System.out.println("pageBean.getPageSize(): "+pageBean.getPageSize());
			System.out.println("pageBean.getTotalPage(): "+pageBean.getTotalPage());
		
			List list = pageBean.getList();
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
			}
			// 3.���������õ�������
			request.setAttribute("pagebean", pageBean);
			System.out.println("--------------PageListServlet Debug End-------------------------");
			// 4.��ת��ָ��ҳ��
			//response.sendRedirect("cfei/lslist.jsp");
			request.getRequestDispatcher("cfei/lslist.jsp").forward(request, response);
			
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
