package pers.arrayli.dao;

import java.sql.SQLException;

import pers.arrayli.domain.Che;

/**
 * @author lzj13
 *	���峵��һЩ���ݲ����ӿ�
 */
public interface CheDao {
	/**	��ӳ�����Ϣ
	 * @param che
	 * @return  ��ӳ����Ƿ�ɹ�
	 * @throws SQLException
	 */
	boolean AddChe(Che che) throws SQLException;
	
	/**	��uid����ѯ������Ϣ
	 * @param uid  �û�id
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
	
	/** ͨ������id���޸ĳ�������Ϣ
	 * @param che
	 * @return
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
 