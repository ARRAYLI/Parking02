package pers.arrayli.utils;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import pers.arrayli.domain.CheWei;
import pers.arrayli.service.CheWeiService;
import pers.arrayli.service.impl.CheWeiServiceImpl;

/**
 * @author lzj13
 *	工具类：把excel中的数据导入到数据库中
 */
public class ImportExcel {
    
    /**
     * 查询指定目录中电子表格中所有的数据
     * @param file 文件完整路径
     * @return  返回表格中的数据集合 list
     */
    public static List<CheWei> getAllByExcel(String file){
        List<CheWei> list=new ArrayList<CheWei>();
        try {
            Workbook rwb=Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet("Test Shee 1");//或者rwb.getSheet(0)
            int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行
            
            System.out.println(clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                    String id = rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
                    String hao = rs.getCell(j++, i).getContents();
                    String info = rs.getCell(j++, i).getContents();
                    String quyu = rs.getCell(j++, i).getContents();
                    String chepai = rs.getCell(j++, i).getContents();
                    String adate = rs.getCell(j++, i).getContents();
                    
                    CheWei cheWei = new CheWei();
                    cheWei.setId(Integer.parseInt(id));
                    cheWei.setHao(hao);
                    cheWei.setInfo(info);
                    cheWei.setQuyu(quyu);
                    cheWei.setChepai(chepai);
                    cheWei.setAdate(adate);
                    
                    System.out.println(chepai.toString());
                    list.add(cheWei);
                    
                   /* System.out.println("id:"+id+" name:"+name+" sex:"+sex+" num:"+num);
                    list.add(new StuEntity(Integer.parseInt(id), name, sex, Integer.parseInt(num)));*/
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return list;
        
    }
    
    /**
     * 通过Id判断是否存在
     * @param id  车位信息id 
     * @return 当前插入的数据的id是否存在 ，存在 false 不存在 true
     */
    public static boolean isExist(int id){
       
    	
    	
    	
        return false;
    }
	
	public static void ImportExcel(String filePath){
		 // 1.得到表格中所有的数据
        List<CheWei> listExcel = getAllByExcel(filePath);
        System.out.println(listExcel.toString());
        
        // 2.调用业务层代码来处理请求
        CheWeiService service = new CheWeiServiceImpl();
       
        
        // 3.把 listExcel 集合中的数据一个一个插入数据库中
        for(CheWei cheWei:listExcel){
        	try {
				boolean result = service.AddCheWei(cheWei);
				if(!result){
					System.out.println("ImportExcel 类中插入  "+cheWei.toString()+" 失败！");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        
        
        
        
        
        
        
       /* DBhepler db=new DBhepler();
        
        for (CheW stuEntity : listExcel) {
            int id=stuEntity.getId();
            if (!StuService.isExist(id)) {
                //不存在就添加
                String sql="insert into stu (name,sex,num) values(?,?,?)";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+""};
                db.AddU(sql, str);
            }else {
                //存在就更新
                String sql="update stu set name=?,sex=?,num=? where id=?";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
                db.AddU(sql, str);
            }
        }*/
        
        
	}
}
 