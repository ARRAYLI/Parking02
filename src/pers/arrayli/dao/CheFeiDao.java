package pers.arrayli.dao;

import java.sql.SQLException;

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
}
 