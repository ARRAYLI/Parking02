package pers.arrayli.service;

import java.sql.SQLException;

import pers.arrayli.domain.Che;
import pers.arrayli.domain.UserInfo;

/**
 * @author lzj13
 *  �����˳���ҵ�������ӿ�
 */
public interface CheService {
	/**	��ӳ�����Ϣ
	 * @param che
	 * @return  ��ӳ����Ƿ�ɹ�
	 * @throws SQLException
	 */
	boolean AddChe(Che che) throws SQLException;
	
	/**	��id����ѯ������Ϣ
	 * @param id  �û�id
	 * @return  ���ز�ѯ���ĳ�����Ϣ
	 * @throws SQLException
	 */
	Che findByUid(int uid) throws SQLException;
	
	
	/**	��id����ѯ������Ϣ
	 * @param id  ������Ϣid
	 * @return  ���ز�ѯ���ĳ�����Ϣ
	 * @throws SQLException
	 */
	Che findById(int id) throws SQLException;
	
	/** �����û���id�������û���Ϣ
	 * @param id  �û�id
	 * @param user  �û���Ϣbean
	 * @return  ���ظ��³ɹ����
	 * @throws SQLException
	 */
	boolean updateCheById(int id,Che che) throws SQLException;
	
	/** ������id��ɾ��������Ϣ
	 * @param id  ������Ϣ id
	 * @return  ����ɾ��������Ϣ�ɹ����
	 * @throws SQLException
	 */
	boolean delCheById(int id) throws SQLException;
}
 