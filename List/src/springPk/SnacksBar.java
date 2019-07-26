package springPk;
//import java.util.List;
import java.util.Set;

public class SnacksBar {

/* private List <String> Chocolate;
 
public List <String> getChocolate() {
	return Chocolate;
}

public void setChocolate(List <String> chocolate) {
	Chocolate = chocolate;
}

public SnacksBar(List <String> chocolate) {
	super();
   Chocolate = chocolate;
}

public SnacksBar() {
	super();
	

}
 */
	private Set <String> softdrinks;

	public Set<String> getSoftdrinks() {
		return softdrinks;
	}

	public void setSoftdrinks(Set<String> softdrinks) {
		this.softdrinks = softdrinks;
	}

	public SnacksBar(Set<String> softdrinks) {
		super();
		this.softdrinks = softdrinks;
	}

	public SnacksBar() {
		super();
		
	}
	
}