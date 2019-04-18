package pers.arrayli.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import pers.arrayli.dao.CheWeiDao;
import pers.arrayli.db.JDBCUtils;
import pers.arrayli.domain.Che;
import pers.arrayli.domain.CheWei;

/**
 * @author lzj13 ʵ�ֳ�λ�ӿ� ���ݿ���ʲ�
 */
public class CheWeiDaoImpl implements CheWeiDao {

	@Override
	public List<CheWei> QueryCheWei(String hao, String quyu) throws SQLException {
		System.out.println("------------------------CheWeiDaoImpl---------------------");
		System.out.println("hao :"+hao);
		System.out.println("quyu: "+quyu);
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from t_chewei where 1=1";
		if(hao != null){
			sql = sql + " and hao like '%" + hao + "%'";				
		}
		if(quyu != null){
			sql = sql + " and quyu like '%" + quyu + "%'";
		}
		
		System.out.println("sql: "+sql);
		List<CheWei> list = queryRunner.query(sql,new BeanListHandler<CheWei>(CheWei.class));
		System.out.println("list: "+list.toString());
		System.out.println("------------------------CheWeiDaoImpl---------------------");
		return list;
	}

	@Override
	public boolean isReverse(String hao) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql  = "select chepai from t_chewei where hao = ?";
		CheWei cheWei = queryRunner.query(sql,new BeanHandler<CheWei>(CheWei.class) ,hao);
		// ������ƺ�Ϊ hao�ĳ�����ѯ�ĳ�λ�Ų�Ϊ�գ�˵���ó��Լ�ͣ��
		if(cheWei.getHao() != null){
			return true;
		}
		// Ϊ�յĻ���˵���ó���û��ͣ��
		return false;
	}

}
