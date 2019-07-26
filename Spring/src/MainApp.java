import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args)
	{
ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
Message msg1=(Message) context.getBean("msgBean");
msg1.setMessage("hello");
System.out.println(msg1.getMessage());
Message msg2=(Message) context.getBean("msgBean");
System.out.println(msg2.getMessage());
msg2.setMessage("bye");
System.out.println(msg1.getMessage());
System.out.println(msg2.getMessage());
}
}
