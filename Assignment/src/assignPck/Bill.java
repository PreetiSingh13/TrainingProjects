package assignPck;
import java.util.*;

public class Bill {
public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
public Bill(int bill_no, int cust_code, List<String> purchase_details) {
		super();
		this.bill_no = bill_no;
		this.cust_code = cust_code;
		this.purchase_details = purchase_details;
	}
public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public int getCust_code() {
		return cust_code;
	}
	public void setCust_code(int cust_code) {
		this.cust_code = cust_code;
	}
	public List<String> getPurchase_details() {
		return purchase_details;
	}
	public void setPurchase_details(List<String> purchase_details) {
		this.purchase_details = purchase_details;
	}
private  int bill_no;
private  int cust_code;
private List <String> purchase_details;



}
