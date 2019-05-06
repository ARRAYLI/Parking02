package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
			System.out.println("=====================================");  
			Enumeration en = request.getParameterNames();  
			
			Map<String, String> map = new HashMap<String,String>();
			while(en.hasMoreElements()){  
			    String name = en.nextElement().toString();  
			    String value = request.getParameter(name);
			    System.out.println(name+" = "+value);  
			    map.put(name,value);
			}  
			System.out.println("=====================================");  
			System.out.println(map.toString());
			
			// ��ȡmap�����currentPage �� type����
		
			int currentPage = Integer.parseInt(map.get("currentPage"));
			
			String type = map.get("type");
			System.out.println("�� url�л�ȡ���Ĳ����ǣ� "+ "\tcurrentPage = "+currentPage+"\ttype = "+type);
			
			
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
			// ��ת������Աҳ��
			if("admin".equals(type)){
				request.getRequestDispatcher("cfei/list.jsp").forward(request, response);
			}else{
				// ��ת���û�ҳ��
				
			}
			//response.sendRedirect("cfei/lslist.jsp");
			
			
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
