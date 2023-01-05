
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.CallableStatement;

public class CollablePreparedStoredProcedure {

	public static void main(String[] args) {
		// Trying to establish a connection to the MySQL DBMS and selecting the DB to
		// work with
		
		// Callable statement
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasejdbc", "root",
					"12345utsav");
			// Used to create a callable statement for the corresponding connection and the
			// stored procedure
			CallableStatement calstat = (CallableStatement) connection.prepareCall("{call InsertInfo(?,?,?)}");
			// Setting the data to be entered
			calstat.setInt(1, 3);
			calstat.setString(2, "Utsav");
			calstat.setString(3, "Panchal");
			calstat.execute();
			// Closing the connection
			calstat.close();
			connection.close();
			System.out.println("The data has been inserted into table.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasejdbc", "root",
					"12345utsav");
			// Using a prepared statement to write an insert query
			PreparedStatement stmt=connection.prepareStatement("insert into customer values(?,?,?)");  
			// Setting the data to be entered
			stmt.setInt(1, 5);
			stmt.setString(2, "Ashish");
			stmt.setString(3, "Sathe");
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted"); 
			// Closing the connection
			connection.close();
			System.out.println("The data has been inserted into table.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
