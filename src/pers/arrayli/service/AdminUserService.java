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
	 *  @param 	queryName  ģ����ѯ��ѯ����
	 * @return	���й���Ա�û��ļ���
	 * @throws SQLException	
	 */
	List<AdminUser> queryAdmins(String queryName) throws SQLException;
	
	/**ͨ�� id �Թ���Ա����в�ѯ
	 * @param id ����Աid
	 * @return	���ع���Ա��Ϣ
	 * @throws SQLException
	 */
	AdminUser findAdminById(int id) throws SQLException;
	
	
	/** ͨ������Ա id ���Թ���Ա��Ϣ�����޸�
	 * @param id 	����Ա id
	 * @return	�޸ĳɹ����
	 * @throws SQLException
	 */
	boolean updateAdminById(int id,AdminUser admin) throws SQLException;
	
	/** ͨ������Ա id ��ɾ������Ա
	 * @param id  ����Ա id
	 * @return   ����ɾ������ĳɹ����
	 * @throws SQLException
	 */
	boolean delAdminById(int id) throws SQLException;
	
	/**	��ӹ���Ա��Ϣ
	 * @param admin		����Աbean
	 * @return			������ӹ���Ա��Ϣ�ɹ����
	 * @throws SQLException
	 */
	boolean addAdmin(AdminUser admin) throws SQLException;
}
