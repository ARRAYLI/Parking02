package pers.arrayli.dao;

import java.sql.SQLException;

import pers.arrayli.domain.AdminUser;
import pers.arrayli.domain.UserInfo;

/**
 * @author lzj13
 *	�����û� dao 
 *	����һЩ��������ݲ����ӿ�
 */
public interface AdminUserDao {
	/**��֤����Ա��¼
	 * @param name  ����Ա����
	 * @param password  ����Ա����
	 * @return  ��¼�ɹ����
	 * @throws SQLException
	 */
	boolean login(String usernam,String password) throws SQLException;

	
}
 