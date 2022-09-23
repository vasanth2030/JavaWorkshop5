package jdbc;
import java.sql.*;
	
public class JDBCMain {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mysql_work_shop";
		String uname="hbstudent";
		String pass="hbstudent";	
		
		//Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		System.out.println("Success");
		
	}
}
