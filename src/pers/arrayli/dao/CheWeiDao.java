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
}
 