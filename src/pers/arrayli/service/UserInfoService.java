package pers.arrayli.service;

import java.sql.SQLException;

/**
 * @author lzj13
 *	�û���Ϣҵ���ӿ�
 */
public interface UserInfoService {
	/**��֤��ͨ�û���¼
	 * @param name  ��ͨ�û�����
	 * @param password  ��ͨ�û�����
	 * @return  �ɹ��������û���id��ʧ�ܣ�0
	 * @throws SQLException
	 */
	int login(String username,String password) throws SQLException;
}
 