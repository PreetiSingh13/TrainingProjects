package springFin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookBeanConfig {
	@Bean
	
public Book getBookBean()
{
	return new Book();
}
	@PostConstruct
	public void init()
	{
		System.out.println("Initializing");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("After destroying");
	} 
}
