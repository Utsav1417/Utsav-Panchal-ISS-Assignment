import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {
	public static void main(String[] args) {
		
		try {
			
			/* Load the mysql-jdbc driver */
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/* Create Connection with Database */
			String url = "jdbc:mysql://127.0.0.1:3306/DatabaseJDBC";
			String username= "root";
			String password = "12345utsav";
			Connection con = DriverManager.getConnection(url,username,password);
			
			/* Create Query */
			String q = "CREATE TABLE TABLE1(tID int(20) PRIMARY KEY auto_increment,"
					+ "tName varchar(200) not null, tCity varchar(400))";
			
			/* Create statement from Query */
			Statement stmt = con.createStatement();
			
			/* Modify the database, no need of reading anything */
			stmt.executeUpdate(q);
			
			/* If table connection was not successful then exception will be raised */
			System.out.println("Table created in Database");
			
			/* Close connection after use */
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
