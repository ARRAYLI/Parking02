package pers.arrayli.dao;

import java.sql.SQLException;

/**
 * @author lzj13
 *	���ѱ�׼�ӿ�
 *	��Ҫ��������һЩ���úͲ�ѯ���ѱ�׼�Ľӿ�
 */
public interface CheFeiDao {
	/**	��ѯ���ѱ�׼
	 * @return ��ѯ�ĳ��ѱ�׼
	 * @throws SQLException
	 */
	int findFare() throws SQLException;
}
 