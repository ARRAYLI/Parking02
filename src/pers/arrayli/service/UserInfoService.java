package pers.arrayli.service;

import java.sql.SQLException;

import pers.arrayli.domain.UserInfo;

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
	
	
	/**  ���û���Ϣ���в�ѯ�����û���Ϣ��ʾ����
	 * @param id
	 * @return  �����û���Ϣbean
	 * @throws SQLException
	 */
	UserInfo QueryById(int id) throws SQLException;
	
	/** �����û���id�������û���Ϣ
	 * @param id  �û�id
	 * @param user  �û���Ϣbean
	 * @return  ���ظ��³ɹ����
	 * @throws SQLException
	 */
	boolean update(int id,UserInfo user) throws SQLException;
}
 