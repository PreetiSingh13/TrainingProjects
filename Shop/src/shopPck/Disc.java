package shopPck;

public class Disc extends Product{
private int capacity;

public Disc() {
	super();
}

public Disc(String pname, int price, String pcode, int capacity) {
	super(pname, price, pcode);
	this.capacity = capacity;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

}
