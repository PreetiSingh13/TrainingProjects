package shopPck;

public abstract class Product {
private String pname;
private int price;
private String pcode;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPcode() {
	return pcode;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public Product(String pname, int price, String pcode) {
	super();
	this.pname = pname;
	this.price = price;
	this.pcode = pcode;
}
public Product() {
	super();
}

}
