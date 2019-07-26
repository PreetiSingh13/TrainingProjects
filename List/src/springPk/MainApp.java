package springPk;

//import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String []args)
{
	ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
	/*SnacksBar snk=(SnacksBar) context.getBean("snkBean");
    List <String> chklst=snk.getChocolate();
	System.out.println("Chocolates available");
	*/
	SnacksBar snk=(SnacksBar) context.getBean("sBean");
    Set <String> chklst=snk.getSoftdrinks();
	System.out.println("Softdrinks available");
	for(String c:chklst){
		System.out.println(c);
	}
}
}
