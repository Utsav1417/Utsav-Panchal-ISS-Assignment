import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertData {

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
			
			/* Create Query the query below is Dynamic in nature */
			String q = "INSERT INTO table1(tName,tCity) values (?,?)";
//			String q = "INSERT INTO table1(tName,tCity) values (Utsav,Gujarat)"; //static query
			
			/* Create statement from Query */
			PreparedStatement pstmt = con.prepareStatement(q);
			
			/* Modify the database, no need of reading anything */
			pstmt.setString(1,"Surendra"); //value of 1st '?'
			pstmt.setString(2,"Rathod"); //value of 2nd '?'
			
			/* Query is already passed */
			pstmt.executeUpdate();
			
			/* If table connection was not successful then exception will be raised */
			System.out.println("Inserted in Database");
			
			/* Close connection after use */
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
