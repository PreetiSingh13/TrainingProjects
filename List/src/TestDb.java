

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDb {
public static void main(String[]args)
{
	try {
		Class.forName("com.mysql.jdbc.driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Driver registered");
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:database","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Connected");
}
}
