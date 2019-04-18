package pers.arrayli.dao;

import java.sql.SQLException;
import java.util.List;

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
 