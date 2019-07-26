package springFin;

import java.util.List;

public class College {
private String cname;
private int Regno;
private String cadd;
private int phone_no;
private List <Teacher> tob;
private List <Student> sob;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getRegno() {
	return Regno;
}
public void setRegno(int regno) {
	Regno = regno;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public int getPhone_no() {
	return phone_no;
}
public void setPhone_no(int phone_no) {
	this.phone_no = phone_no;
}
public List <Teacher> getTob() {
	return tob;
}
public void setTob(List<Teacher> tob) {
	this.tob = tob;
}
public List <Student> getSob() {
	return sob;
}
public void setSob(List <Student> sob) {
	this.sob = sob;
}
public College(String cname, int regno, String cadd, int phone_no,List <Teacher> tob,List <Student> sob) {
	super();
	this.cname = cname;
	this.Regno = regno;
	this.cadd = cadd;
	this.phone_no = phone_no;
	this.tob=tob;
			this.sob=sob;
}
public College() {
	super();
	
}
}
