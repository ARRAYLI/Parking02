package pers.arrayli.domain; 

/**
 * @author lzj13
 *	���ѱ�׼ bean
 */
public class CheFeiPrice {
	private int id;  	// ���ѱ�׼id
	private int price;	// ���ѱ�׼
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CheFei [id=" + id + ", price=" + price + "]";
	}
	
	
}
 