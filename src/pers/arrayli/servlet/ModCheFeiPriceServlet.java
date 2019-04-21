package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheFeiPrice;
import pers.arrayli.service.CheFeiPriceService;
import pers.arrayli.service.impl.CheFeiPriceServiceImpl;


/**
 * @author lzj13
 *	�޸ĳ��Ѽ۸� servlet
 */
public class ModCheFeiPriceServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG Start----------------------");
			// 1.��ȡ���Ѽ۸�����
			int id = Integer.parseInt(request.getParameter("id"));
			int price = Integer.parseInt(request.getParameter("price"));
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG 1----------------------");
			// 2.�ѳ��Ѽ۸��װ��һ�� CheFeiPrice����
			CheFeiPrice cheFeiPrice = new CheFeiPrice();
			cheFeiPrice.setPrice(price);
			cheFeiPrice.setId(id);
			System.out.println("chefei: "+cheFeiPrice.toString());
			// 3.ͨ��ҵ�����봦������
			CheFeiPriceService service = new CheFeiPriceServiceImpl();
			boolean result = service.setFare(id, cheFeiPrice);
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG 2----------------------");
			// ����޸ĳ��Ѽ۸�ɹ�
			if(result){
				request.getSession().setAttribute("fei", price);
				response.getWriter().println("<script>alert('�޸��շѱ�׼�ɹ���');window.location.href='fei/modFei.jsp'</script>");
			}else{
				// ����޸ĳ��ѽ��ʧ��
				response.getWriter().println("<script>alert('�޸��շѱ�׼ʧ�ܣ�');window.location.href='fei/modFei.jsp'</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------ModCheFeiPriceServlet DEBUG End----------------------");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
