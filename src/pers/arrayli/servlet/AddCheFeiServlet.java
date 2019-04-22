package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheFei;
import pers.arrayli.service.CheFeiService;
import pers.arrayli.service.impl.CheFeiServiceImpl;


/**
 * @author lzj13
 *	��ӳ�����Ϣ
 */
public class AddCheFeiServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 1.��ȡ����
			String chepai = request.getParameter("chepai");					// ���ƺ�
			String jdate = request.getParameter("jdate");					// �볡ʱ��
			String ldate = request.getParameter("ldate");					// �뿪ʱ��
			int cost = Integer.parseInt(request.getParameter("cost"));		// ͣ������
			int hours = Integer.parseInt(request.getParameter("shijian"));	// ͣ��ʱ��
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(date);							// ��ǰʱ��
			int biaoPrice = Integer.parseInt(request.getParameter("biao"));	// ͣ����׼�۸�
			
			// 2.�ѻ�ȡ�������ݷ�װ��һ�� CheFei ����
			CheFei chefei = new CheFei();
			chefei.setHao(chepai);
			chefei.setJdate(jdate);
			chefei.setLdate(ldate);
			chefei.setCost(cost);
			chefei.setHours(hours);
			chefei.setAdate(currentTime);
			chefei.setPrice(biaoPrice);
			
			// 3.����ҵ����������������
			CheFeiService service = new CheFeiServiceImpl();
			boolean result = service.AddCheFei(chefei);
			// �����ӳɹ��Ļ�
			if(result){
				
			}else{
				// ������ʧ�ܵĻ�
				
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
