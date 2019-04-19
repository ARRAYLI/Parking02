package pers.arrayli.service;

import java.sql.SQLException;

import pers.arrayli.domain.CheFeiPrice;

/**
 * @author lzj13
 *	���峵�ѱ�׼ҵ���ӿ�
 */
public interface CheFeiPriceService {
	/**	��ѯ���ѱ�׼
	 * @return ��ѯ�ĳ��ѱ�׼
	 * @throws SQLException
	 */
	int findFare() throws SQLException;
	
	/**	���ó��ѱ�׼
	 * @param  id		���ѱ�׼id
	 * @param price		���ѱ�׼
	 * @return	���ó��ѱ�׼�ɹ����
	 * @throws SQLException
	 */
	boolean setFare(int id,CheFeiPrice price) throws SQLException;
}
 