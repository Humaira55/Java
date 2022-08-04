import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/hospital";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "CREATE TABLE doctor (Id int ,Name varchar(50),Salary double)";
		
//		String query = "CREATE TABLE doctor (Id int NOT NULL AUTO_INCREMENT,Name varchar(50),Salary double,PRIMARY KEY(Id))";
		
		Connection cn = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);                   //Driver Registration
			System.out.println("Driver Loaaded Successfully");
			
			cn = DriverManager.getConnection(url, "root", "password");
			System.out.println("Connection Established Successfully..");
			
			stmt = cn.createStatement();             //platform creation where sql query can be execute
			System.out.println("Platform created Successfully..");
			
			stmt.execute(query);
			System.out.println("Query executed successfully..");
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println("Problem while Loading/Connecting");
			e.printStackTrace();
		}
		finally {
			try {
				cn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


}
