package pers.arrayli.domain; 

/**
 * @author lzj13
 *	����bean
 */
public class CheFei {
	private int id;			// ������Ϣ id
	private String hao;		// ���ƺ�
	private String jdate;	// �볡ʱ��	
	private String ldate;	// �뿪ʱ��
	private int cost;		// ����
	private String adate;	// ��ǰʱ��
	private int hours;		// ͣ��ʱ��
	private int price;		// ͣ���۸��׼
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
	public String getJdate() {
		return jdate;
	}
	public void setJdate(String jdate) {
		this.jdate = jdate;
	}
	public String getLdate() {
		return ldate;
	}
	public void setLdate(String ldate) {
		this.ldate = ldate;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CheFei [id=" + id + ", hao=" + hao + ", jdate=" + jdate + ", ldate=" + ldate + ", cost=" + cost
				+ ", adate=" + adate + ", hours=" + hours + ", price=" + price + "]";
	}
}
 