package pers.arrayli.service;

import java.sql.SQLException;

/**
 * @author lzj13
 *	���峵�ѱ�׼ҵ���ӿ�
 */
public interface CheFeiService {
	/**	��ѯ���ѱ�׼
	 * @return ��ѯ�ĳ��ѱ�׼
	 * @throws SQLException
	 */
	int findFare() throws SQLException;
}
 