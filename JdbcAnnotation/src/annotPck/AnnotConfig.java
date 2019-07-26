package annotPck;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AnnotConfig {

	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	 return jdbcTemplate;
	}
	@Bean
	public EmployeeJdbcDaoImpl employeeDaoImpl()
	{
		EmployeeJdbcDaoImpl employeeDaoImpl =new EmployeeJdbcDaoImpl();
		return employeeDaoImpl;
		
	}
	
}
