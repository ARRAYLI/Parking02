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
	 * @return  ��¼�ɹ����
	 * @throws SQLException
	 */
	boolean login(String username,String password) throws SQLException;
}
 