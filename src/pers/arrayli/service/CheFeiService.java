package pers.arrayli.service;

import java.sql.SQLException;

import pers.arrayli.domain.CheFei;

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
}
 