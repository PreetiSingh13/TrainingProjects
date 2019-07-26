package springPck;

public class Manager {
private String mname;
private int id;
private Employee emo;
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Manager(String mname, int id,Employee emo) {
	super();
	this.mname = mname;
	this.id = id;
}
public Employee getEmo() {
	return emo;
}
public void setEmo(Employee emo) {
	this.emo = emo;
}
public Manager() {
	super();
}

}
