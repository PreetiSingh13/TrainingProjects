package springFin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Book {
	@Value("1234")
private int bcode;
@Value("Physics")
private String bname;
@Value("250.0")
private double price;
@Autowired

private Publisher pob;

public Publisher getPob() {
	return pob;
}


public void setPob(Publisher pob) {
	this.pob = pob;
}

public int getBcode() {
	return bcode;
}
public void setBcode(int bcode) {
	this.bcode = bcode;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public Book(int bcode, String bname, double price,Publisher pob) {
	super();
	this.bcode = bcode;
	this.bname = bname;
	this.price = price;
	this.pob=pob;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Publisher pob) {
	super();
	this.pob = pob;
}



}
