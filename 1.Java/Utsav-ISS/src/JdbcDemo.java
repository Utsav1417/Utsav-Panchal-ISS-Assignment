import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		
		try {
			
			/* Load the mysql-jdbc driver */
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Class.forName("com.mysql.jdbc.Driver");

			/* Create Connection with Database */
			String url = "jdbc:mysql://127.0.0.1:3306/databasejdbc";
			String username= "root";
			String password = "12345utsav";
			Connection con = DriverManager.getConnection(url,username,password);
			
			/* Check for successful connection */
			if (con.isClosed()) {
				System.out.println("Connection is closed");
			}
			else {
				System.out.println("Connection Created");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
