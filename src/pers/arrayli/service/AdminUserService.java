package pers.arrayli.service;

import java.sql.SQLException;

/**
 * @author lzj13
 *	�������Ա�û�������ҵ���߼���ӿ�
 */
public interface AdminUserService {
	/**��֤����Ա��¼
	 * @param name  ����Ա����
	 * @param password  ����Ա����
	 * @return  ��¼�ɹ����
	 * @throws SQLException
	 */
	boolean login(String username,String password) throws SQLException;
}
