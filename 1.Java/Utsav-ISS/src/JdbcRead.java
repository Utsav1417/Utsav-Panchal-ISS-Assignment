import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JdbcRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/* Load the mysql-jdbc driver */
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/* Create Connection with Database */
			String url = "jdbc:mysql://127.0.0.1:3306/DatabaseJDBC";
			String username= "root";
			String password = "12345utsav";
			Connection con = DriverManager.getConnection(url,username,password);
			
			/* Create Query */
			String q = "SELECT * FROM Table1";
			Statement stmt = con.createStatement();
			
			/* Pass query to statement object and execute it */
			ResultSet resSet = stmt.executeQuery(q); 
			
			/* If table connection was not successful then exception will be raised */
			System.out.println("Table read from Database");
			
			/* Printing table contents on console */
			System.out.println("Table from Database: ");
			while(resSet.next()) {
				System.out.println(resSet.getInt(1)+" "+ resSet.getString(2)+" "
						+resSet.getString(3));
			}
			
			/* Close connection after use */
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
