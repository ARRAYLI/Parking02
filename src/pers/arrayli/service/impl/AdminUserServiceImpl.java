package pers.arrayli.service.impl;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.AdminUser;

import pers.arrayli.dao.AdminUserDao;
import pers.arrayli.dao.impl.AdminUserDaoImpl;
import pers.arrayli.service.AdminUserService;

/**
 * @author lzj13
 *	ʵ��AdminUserService�ӿڵķ���
 */
public class AdminUserServiceImpl implements AdminUserService {

	@Override
	public boolean login(String username,String password) throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.login(username,password);
	}

	@Override
	public List<AdminUser> queryAdmins() throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.queryAdmins();
	}

	@Override
	public AdminUser findAdminById(int id) throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.findAdminById(id);
	}

	@Override
	public boolean updateAdminById(int id, AdminUser admin) throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.updateAdminById(id, admin);
	}

	@Override
	public boolean delAdminById(int id) throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.delAdminById(id);
	}

	@Override
	public boolean addAdmin(AdminUser admin) throws SQLException {
		AdminUserDao dao = new AdminUserDaoImpl();
		return dao.addAdmin(admin);
	}
}
 