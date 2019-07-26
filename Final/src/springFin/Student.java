package springFin;

public class Student {
private String sname;
private String branch;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Student(String sname, String branch) {
	super();
	this.sname = sname;
	this.branch = branch;
}
public Student() {
	super();
	
}

}
