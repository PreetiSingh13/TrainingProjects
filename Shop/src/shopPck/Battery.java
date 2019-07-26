package shopPck;

public class Battery extends Product{
private boolean recharge;

public Battery() {
	super();
	
}


public Battery(String pname, int price, String pcode, boolean recharge) {
	super(pname, price, pcode);
	this.recharge = recharge;
}
public boolean isRecharge() {
	return recharge;
}
public void setRecharge(boolean recharge) {
	this.recharge = recharge;
}
}
