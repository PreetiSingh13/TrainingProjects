package springFin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherBeanConfig {
	@Bean
	public Publisher getPublisherBean()
	{
		return new Publisher();
	}

}
