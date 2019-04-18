package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import pers.arrayli.service.CheService;
import pers.arrayli.service.CheWeiService;
import pers.arrayli.service.impl.CheFeiServiceImpl;
import pers.arrayli.service.impl.CheServiceImpl;
import pers.arrayli.service.impl.CheWeiServiceImpl;


/**
 * @author lzj13
 *	Ԥ����λservlet
 */
public class ReserveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���������
		PrintWriter out = response.getWriter();
		try {
			// ��ȡԤ����λ id
			int id = Integer.parseInt(request.getParameter("id"));
			
			// ��ȡ�û� id
			int uid = Integer.parseInt(request.getSession().getAttribute("uid").toString());
			
			//�����û� uid  ����ѯ���ƺ�
			CheService service = new CheServiceImpl();
			String hao = service.getHaoByUid(uid);
			
			System.out.println("id: "+id+"\tuid: "+uid+"\thao: "+hao);
			// ������ƺŲ�Ϊ�յĻ�,����Ԥ����λ
			if(hao != null){
				// �ڳ�λ��Ϣ���в�ѯ ���ƺ�Ϊ hao ����û��ͣ��
				CheWeiService cheWeiService = new CheWeiServiceImpl();
				System.out.println("================== ReserveServlet DEBUG Start =============");
				// ����Ѿ�ͣ���Ļ�
				if(cheWeiService.isReverse(hao)){
					System.out.println("================== ReserveServlet DEBUG End =============");
					out
.println("<script>alert('��ĳ��Ѿ�ͣ�ڳ�λ�ϣ�');window.location.href='chewei/tlist.jsp'</script>");
				}else{
					// ���û��ͣ���Ļ�
					// ��ȡ��ǰʱ��
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date date = new Date();
					String time = sdf.format(date);
					boolean result = cheWeiService.updateCheWei(hao,time, uid);
					
					// Ԥ���ɹ�
					if(result){
						out
.println("<script>alert('Ԥ���ɹ���');window.location.href='chewei/tlist.jsp'</script>");
					}else{
						// Ԥ��ʧ��
						out
.println("<script>alert('Ԥ��ʧ�ܣ�');window.location.href='chewei/tlist.jsp'</script>");
					}
				}
			}else{ 
				// ���ƺ�Ϊ�յĻ���������ӳ�����Ϣ
				out
.println("<script>alert('����ӳ�����Ϣ��');window.location.href='chewei/tlist.jsp'</script>");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
