package pers.arrayli.dao;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.UserInfo;

/**
 * @author lzj13
 * ��ͨ�û� dao  �û���Ϣ���ݷ��ʲ�
 */
public interface UserInfoDao {
	/**��֤��ͨ�û���¼
	 * @param name  ��ͨ�û�����
	 * @param password  ��ͨ�û�����
	 * @return  �ɹ��������û���id��ʧ�ܣ�0
	 * @throws SQLException
	 */
	int login(String username,String password) throws SQLException;
	
	/**  ���û���Ϣ���в�ѯ�����û���Ϣ��ʾ����
	 * @param id
	 * @return  �����û���Ϣbean
	 * @throws SQLException
	 */
	UserInfo QueryById (int id) throws SQLException;

	/** �����û���id�������û���Ϣ
	 * @param id  �û�id
	 * @param user  �û���Ϣbean
	 * @return  ���ظ��³ɹ����
	 * @throws SQLException
	 */
	boolean update(int id,UserInfo user) throws SQLException;
	
	/**	�����û��� id�� ��ѯ�û������
	 * @param id		
	 * @return  �û����
	 * @throws SQLException
	 */
	int QueryMoneyById(int id) throws SQLException;
	
	
	/**ע���û�
	 * @param user	����Ϣ����
	 * @return		�����Ƿ�ע��ɹ�
	 * @throws SQLException
	 */
	boolean RegisterUser(UserInfo user) throws SQLException;
	
	/**	��ѯ���е��û���Ϣ���߰��������в�ѯ�û���Ϣ
	 * @param queryName   ��ѯ����
	 * @return	��ѯ�����
	 * @throws SQLException
	 */
	List<UserInfo> queryAllUserInfos(String queryName) throws SQLException;
	
	
	/**����û���Ϣ
	 * @param user	��ӵ��û���Ϣ
	 * @return		��ӳɹ����
	 * @throws SQLException
	 */
	boolean addUserInfo(UserInfo user) throws SQLException;
	
	
	/**	���û� id�����û����г�ֵ
	 * @param uid   �û� id
	 * @param money   ��ֵ���
	 * @return	���س�ֵ�ɹ����
	 * @throws SQLException
	 */
	boolean UserRecharge(int uid,int money) throws SQLException;
	
	boolean DelUseInfo(int uid) throws SQLException;
	
	
}
 