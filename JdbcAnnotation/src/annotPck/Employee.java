package annotPck;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee{
	@Column(name="ename")
	private String ename;
	@Column(name="ecode")
	private int ecode;
	@Column(name="dept")
	private String dept;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String ename, int ecode, String dept) {
		super();
		this.ename = ename;
		this.ecode = ecode;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", ecode=" + ecode + ", dept=" + dept + "]";
	}
	
	
}

