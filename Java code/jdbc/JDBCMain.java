package jdbc;
import java.sql.*;
	
public class JDBCMain {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mysql_work_shop";
		String uname="hbstudent";
		String pass="hbstudent";	
		
		//Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con= DriverManager.getConnection(url,uname,pass);

		//Create a statement
		Statement st= con.createStatement();
		
		//Execute the query
		int n= st.executeUpdate("insert into student values (21,'Arun Kumar','arunkumar@gmail.com',25)");
		System.out.println(n+" rows affected.");		
		ResultSet rs= st.executeQuery("select * from student");
		
		//Process the results
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" | "+ rs.getString(2)+" | "+ rs.getString(3)+" | "+rs.getInt(4));
		}
		
		//Close the connection
		con.close();
	}
}
