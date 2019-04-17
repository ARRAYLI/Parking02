package pers.arrayli.service.impl;

import java.sql.SQLException;

import pers.arrayli.dao.UserInfoDao;
import pers.arrayli.dao.impl.UserInfoDaoImpl;
import pers.arrayli.domain.UserInfo;
import pers.arrayli.service.UserInfoService;

/**
 * @author lzj13
 *	�û���Ϣҵ������
 */
public class UserInfoServiceImpl implements UserInfoService{
	// ��֤��ͨ�û���¼
	@Override
	public int login(String username, String password) throws SQLException {
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		return userInfoDao.login(username, password); 
	}

	@Override
	public UserInfo QueryById(int id) throws SQLException {
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		return userInfoDao.QueryById(id);
	}

	@Override
	public boolean update(int id, UserInfo user) throws SQLException {
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		return userInfoDao.update(id, user);
	}

	@Override
	public int QueryMoneyById(int id) throws SQLException {
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		return userInfoDao.QueryMoneyById(id);
	}

}
 