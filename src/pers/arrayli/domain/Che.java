package pers.arrayli.domain; 

public class Che {
	private int id;				// ������Ϣid
	private String hao;			// ���ƺ�
	private String leixing;		// ������
	private String picture;		// ͼƬ
	private String info;		// ��ע
	private int uid;			// �û�id
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
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Che [id=" + id + ", hao=" + hao + ", leixing=" + leixing + ", picture=" + picture + ", info=" + info
				+ ", uid=" + uid + "]";
	}
	
	
}
 