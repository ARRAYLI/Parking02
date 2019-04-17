package pers.arrayli.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.xml.internal.ws.Closeable;

/**
 * @author lzj13
 *	�������ݿ�����Ӻ��ͷŲ���    ����ʹ��C3P0���ݿ�������ȡ����Դ�ʹ������ݿ�����
 */
public class JDBCUtils {
	// ��������Դ����
	static ComboPooledDataSource dataSource = null;
	
	//ʹ�þ�̬��������Դ���ڴ���һ���ؾͻ�ȡ������
	static {
		dataSource = new ComboPooledDataSource();
	}
	
	/**
	 * @return  ������������Դ
	 */
	public static ComboPooledDataSource getDataSource(){
		return dataSource;
	}
	
	
	/**
	 * @return  ���ش��������ݿ����Ӷ���
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	/** ������������ͷ����ݿ�����ݵĲ�ѯ����
	 * @param con  ���ݿ����Ӷ���
	 * @param st   ִ�в���������sql���
	 * @param rs   ���ݽ������
	 */
	public static void release(Connection con,Statement st,ResultSet rs){
		closeCon(con);
		closeSt(st);
		closeRs(rs);
	}
	
	/** �����ͷ����ӷ��� ��������������ݿ�����ɾ���ĵȹ���
	 * @param con  ���ݿ����Ӷ���
	 * @param st   ִ�в���������sql���
	 * @param rs   ���ݽ������
	 */
	public static void release(Connection con,Statement st){
		closeCon(con);
		closeSt(st);
	}
	
	/** �ر����ݿ����Ӷ���
	 * @param con  ���ݿ����Ӷ���
	 * @throws SQLException 
	 */
	public static void closeCon(Connection con) {
		try {
			if(con != null){
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			con = null;
		}
	}
	
	/** �ر����ݿ����������
	 * @param st  ���ݿ����ִ�ж���
	 */
	public static void closeSt(Statement st){
		try {
			if(st != null){
				st.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}finally{
			st = null;
		}
	}
	
	/** �ر����ݿ��ѯ�����
	 * @param st  ��ѯ�����
	 */
	public static void closeRs(ResultSet rSet){
		try {
			if(rSet != null){
				rSet.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}finally{
			rSet = null;
		}
	}
}
 