package springFin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[]args){
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	College clg=(College) context.getBean("cbean");
	System.out.println("CollegeName :"+clg.getCname());
	System.out.println("Registration num :"+clg.getRegno());
	System.out.println("College address :"+clg.getCadd());
	System.out.println("Phone number :"+clg.getPhone_no());
}


}
