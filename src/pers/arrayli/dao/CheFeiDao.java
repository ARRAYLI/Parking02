package pers.arrayli.dao;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.CheFei;

/**
 * @author lzj13
 *	������Ϣ�ӿ�		��Ҫ������ڳ��ѵĲ���
 */
public interface CheFeiDao {
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
}
 