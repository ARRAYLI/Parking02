package pers.arrayli.dao;

import java.sql.SQLException;

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
}
 