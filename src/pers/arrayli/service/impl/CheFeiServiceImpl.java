package pers.arrayli.service.impl;

import java.sql.SQLException;

import pers.arrayli.dao.CheFeiDao;
import pers.arrayli.dao.impl.CheFeiDaoImpl;
import pers.arrayli.service.CheFeiService;
import pers.arrayli.service.CheService;

/**
 * @author lzj13
 *	ʵ�ֳ��ѵ�ҵ���ӿ�
 */
public class CheFeiServiceImpl implements CheFeiService {

	@Override
	public int findFare() throws SQLException {
		CheFeiDao dao = new CheFeiDaoImpl();
		return dao.findFare();
	}

}
 