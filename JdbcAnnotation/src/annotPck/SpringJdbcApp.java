package annotPck;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcApp {
public static void main(String[]args)
{
	ApplicationContext context=new AnnotationConfigApplicationContext(AnnotConfig.class);
	EmployeeDao service=context.getBean(EmployeeJdbcDaoImpl.class);
	Employee e=new Employee("Dinesh",1,"EC");
	 service.save(e);
	  System.out.println("Display all");
	  List <Employee> elist =service.list();
	  for(Employee emp: elist)
	  {
		  System.out.println(emp);
	  }
}
}
