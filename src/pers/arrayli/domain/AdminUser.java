package pers.arrayli.domain; 

/**
 * @author lzj13
 * ����Ա�û�bean
 */
public class AdminUser {
	private int id;   		  		// ����Ա�û�id
	private String userName;  		// ����Ա�û�����
	private String userPassword;  	// ����Ա�û�����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "AdminUser [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
 