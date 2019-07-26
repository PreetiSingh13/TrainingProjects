package springPck;

public class Employee extends Manager {
private String name;
private int salary;
private String mname;
private int id;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(String name, int salary,String mname, int id) {
	super();
	this.name = name;
	this.salary = salary;
	this.mname = mname;
	this.id = id;
}
public Employee() {
	super();
	
}

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


}
