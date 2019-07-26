package annotPck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("EmployeeDao")


public class EmployeeJdbcDaoImpl implements EmployeeDao {
@Autowired
JdbcTemplate jdt;
@Override
public void save(Employee e)
{
	jdt.update("insert into Employee values (?,?,?)",e.getEname(),e.getEcode(),e.getDept());
	System.out.println("Employee added !");
}
	@Override
	public List <Employee> list()
	{
		List <Employee> elist=jdt.query("select * from Employee",new BeanPropertyRowMapper<Employee>(Employee.class));
		return elist;
	}
	
	
}







