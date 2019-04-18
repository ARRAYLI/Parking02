package pers.arrayli.service;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.AdminUser;

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
	

	/**	��ѯ���й���Ա�û�
	 * @return	���й���Ա�û��ļ���
	 * @throws SQLException	
	 */
	List<AdminUser> queryAdmins() throws SQLException;
	
	/**ͨ�� id �Թ���Ա����в�ѯ
	 * @param id ����Աid
	 * @return	���ع���Ա��Ϣ
	 * @throws SQLException
	 */
	AdminUser findAdminById(int id) throws SQLException;
}
