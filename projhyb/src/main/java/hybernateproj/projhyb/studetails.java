package hybernateproj.projhyb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studetails {
	@Id
	private int stuId;
	private String stuName;
	private String city;
	private int fee;
	
	public int getStuId() {
		return stuId;
	}
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getFee() {
		return fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public studetails(int stuId, String stuName, String city,int fee) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.city = city;
		this.fee = fee;
	}

	public studetails() {}

}
