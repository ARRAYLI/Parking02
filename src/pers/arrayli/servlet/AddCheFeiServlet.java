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
import pers.arrayli.service.CheWeiService;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.CheFeiServiceImpl;
import pers.arrayli.service.impl.CheWeiServiceImpl;
import pers.arrayli.service.impl.UserInfoServiceImpl;


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
			// ��ӳ���
			boolean res1 = service.AddCheFei(chefei);
			
			// �ɷ���Ϻ󣬳�λ�ͳ��˿�λ�����³�λ
			CheWeiService service2 = new CheWeiServiceImpl();
			boolean res2 = service2.updateCheWeiByChepai(chepai);
			
			// �����û��������
			UserInfoService service3 = new UserInfoServiceImpl();
			boolean res3 = service3.updateUserMoney(chepai, cost);
			
			// ������³ɹ�
			if(res1 && res2 && res3){
				response.getWriter()
.println("<script>alert('�ɷѳɹ���');window.location.href='chewei/jflist.jsp'</script>");
			}else{
				response.getWriter()
.println("<script>alert('�ɷ�ʧ�ܣ�');window.location.href='chewei/jflist.jsp'</script>");
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
