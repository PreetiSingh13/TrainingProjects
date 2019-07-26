package springFin;

public class Publisher {
	
private String pname;
private String bname;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public Publisher(String pname, String bname) {
	super();
	this.pname = pname;
	this.bname = bname;
}
public Publisher() {
	super();

}
}
