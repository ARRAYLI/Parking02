package pers.arrayli.dao;

import java.sql.SQLException;
import java.util.List;


import pers.arrayli.domain.CheFei;

/**
 * @author lzj13
 *	������Ϣ�ӿ�		��Ҫ������ڳ��ѵĲ���
 */
public interface CheFeiDao {
	
	int PAGE_SIZE  = 7;  // ÿҳ��ʾ�ĸ���  ����
	
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
	List<CheFei> findCheFeiByPage(int currentPage,String chepai,String jdate) throws SQLException;
	
	/**	��ѯ�ܵļ�¼��
	 * @return  �ܵļ�¼��
	 * @throws SQLException
	 */
	int findCount(String chepai,String jdate) throws SQLException;
}
 