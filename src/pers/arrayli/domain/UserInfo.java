package pers.arrayli.domain; 

/**
 * @author lzj13
 * �û�������Ϣ bean
 */
public class UserInfo {
	private int id;				// �û�Id
	private String username;	// �û�����
	private String pwd;			// �û�����
	private int age;			// �û�����
	private String tel;			// �û��绰
	private int money;			// �û������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", pwd=" + pwd + ", age=" + age + ", tel=" + tel
				+ ", money=" + money + "]";
	}
}
 