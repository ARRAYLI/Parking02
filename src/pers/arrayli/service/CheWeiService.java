package pers.arrayli.service;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.CheWei;

/**
 * @author lzj13
 *	���峵λ��Ϣ��ҵ���ӿ�
 */
public interface CheWeiService {
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
}
 