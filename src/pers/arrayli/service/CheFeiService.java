package pers.arrayli.service;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.CheFei;
import pers.arrayli.domain.PageBean;

/**
 * @author lzj13
 *	����ҵ���ӿ�
 */
public interface CheFeiService {
	/**��ӳ�����Ϣ
	 * @param cheFei  ������Ϣ����
	 * @return	��ӳɹ����
	 * @throws SQLException
	 */
	boolean AddCheFei(CheFei cheFei) throws SQLException;
	
	/**	���ؼ��ֲ�ѯ������Ϣ��¼
	 * @param chepai	���ƺ�
	 * @param date		ͣ������
	 * @return			��ѯ����
	 * @throws SQLException
	 */
	List<CheFei> QueryCheFei(String chepai,String date) throws SQLException;
	
	
	/**	��ѯ��ǰ������Ϣ����
	 * @param currentPage	��ǰҳ��
	 * @return				������Ϣ����
	 * @throws SQLException
	 */
	PageBean findCheFeiByPage(int currentPage,String chepai,String jdate) throws SQLException;
}
 