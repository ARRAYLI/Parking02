package pers.arrayli.domain; 

/**
 * @author lzj13
 *	��λbean
 */
public class CheWei {
	private int id;				// ��λ id
	private String hao;			// ��λ��
	private String info;		// ��ע
	private String quyu;		// ����
	private String chepai;		// ����	
	private String adate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHao() {
		return hao;
	}
	public void setHao(String hao) {
		this.hao = hao;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getQuyu() {
		return quyu;
	}
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	public String getChepai() {
		return chepai;
	}
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	@Override
	public String toString() {
		return "CheWei [id=" + id + ", hao=" + hao + ", info=" + info + ", quyu=" + quyu + ", chepai=" + chepai
				+ ", adate=" + adate + "]";
	}	
	
}
 