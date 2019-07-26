package springFin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
public static void main(String[]args){
	ApplicationContext context= new AnnotationConfigApplicationContext(BookBeanConfig.class,PublisherBeanConfig.class);
	Book b1=(Book)context.getBean(Book.class);
	System.out.println("Name :"+b1.getBname()+"\nPrice :"+b1.getPrice());
	Book b2=(Book) context.getBean(Book.class);
	System.out.println("Name :"+b1.getBname()+"\nPrice :"+b1.getPrice());
	b2.setBname("Maths");
	System.out.println("Name :"+b1.getBname()+"\nPrice :"+b1.getPrice());
	
	
	
}
}