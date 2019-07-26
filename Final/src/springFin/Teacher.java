package springFin;

public class Teacher {
private String tname;
private String dept;
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Teacher(String tname, String dept) {
	super();
	this.tname = tname;
	this.dept = dept;
}
public Teacher() {
	super();
	
}

}
