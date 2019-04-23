package pers.arrayli.dao;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.CheWei;

/**
 * @author lzj13
 *	���峵λ���ݷ��ʲ�ӿ�
 */
public interface CheWeiDao {

	/**	����λ�Ų��һ��߰�������ң����߰���������һ�����
	 * @param hao
	 * @param quyu
	 * @return
	 * @throws SQLException
	 */
	List<CheWei> QueryCheWei(String hao,String quyu) throws SQLException;
	
	/**	�ڳ�λ��Ϣ���в��ҳ��ƺ�Ϊ hao ��û��ͣ��
	 * @param hao  ���ƺ�
	 * @return	   ���س��ƺ�Ϊ hao �ĳ�����û��ͣ��
	 * @throws SQLException
	 */
	boolean isReverse(String hao) throws SQLException;
	
	/** ���µ�ǰ��λ��Ϣ
	 * @param hao		���ƺ�
	 * @param adate		��ǰʱ�������
	 * @param id		��λ��Ϣ id
	 * @return			���³ɹ����
	 * @throws SQLException
	 */
	boolean updateCheWei(String hao,String adate,int id) throws SQLException;
	
	
	/**	ͨ����λ Id �����ҳ�λ��Ϣ
	 * @param id	��λ id��ѯ�ĳ�λ��Ϣ
	 * @return		����
	 * @throws SQLException
	 */
	CheWei findCheWeiById(int id) throws SQLException;
	
	/**	ͨ����λ id���޸ĳ�λ��Ϣ
	 * @param id		��λ��Ϣ id
	 * @param cheWei	��λ����
	 * @return			�����޸ĳɹ����
	 * @throws SQLException
	 */
	boolean updateCheWeiById(int id,CheWei cheWei) throws SQLException;
	
	/**	ͨ����λid��ɾ����λ��Ϣ
	 * @param id	��λ id
	 * @return		����ɾ����λ��Ϣ�ɹ����
	 * @throws SQLException
	 */
	boolean DelCheWeiById(int id) throws SQLException;
	
	/**	��ӳ�λ��Ϣ
	 * @param cheWei	��λ��Ϣ����	
	 * @return			��ӳ�λ��Ϣ�ɹ����
	 * @throws SQLException
	 */
	boolean AddCheWei(CheWei cheWei) throws SQLException;
	
	/**���ݳ�λ��Ϣ����ĳ��ƺ� ����ѯ�û������
	 * @param chepai	���ƺ�
	 * @return			�û������
	 * @throws SQLException
	 */
	int GetUserMoney(String chepai) throws SQLException;
	
	/**�����ƺ������³�λ��Ϣ
	 * @param chepai	���ƺ�	
	 * @return			����ͣ���ɹ����
	 * @throws SQLException
	 */
	boolean updateCheWeiByChepai(String chepai) throws SQLException;
}
