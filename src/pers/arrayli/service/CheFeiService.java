package pers.arrayli.service;

import java.sql.SQLException;
import java.util.List;

import pers.arrayli.domain.CheFei;

/**
 * @author lzj13
 *	车费业务层接口
 */
public interface CheFeiService {
	/**添加车费信息
	 * @param cheFei  车费信息对象
	 * @return	添加成功与否
	 * @throws SQLException
	 */
	boolean AddCheFei(CheFei cheFei) throws SQLException;
	
	/**	按关键字查询车费信息记录
	 * @param chepai	车牌号
	 * @param date		停车日期
	 * @return			查询集合
	 * @throws SQLException
	 */
	List<CheFei> QueryCheFei(String chepai,String date) throws SQLException;
}
 