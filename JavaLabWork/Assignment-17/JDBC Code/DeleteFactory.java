import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteFactory {
	
	void delete() throws ClassNotFoundException, SQLException
{
		
		String url = "jdbc:mysql://localhost:3306/hospital";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection cn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		
		Class.forName(driver);
		
		cn = DriverManager.getConnection(url, "root", "password");
		
		stmt = cn.createStatement();
		
		Scanner sc1 = new Scanner(System.in);
		
		String delete_query = "delete from doctor where Id = ?";
		pstmt = cn.prepareStatement(delete_query);
		
		System.out.println("Enter Doctor Id : ");
		int id = sc1.nextInt();
		
		if(check(id,stmt)==true)
		{			
			pstmt.setInt(1, id);
			
			pstmt.executeUpdate();	
			System.out.println("Data Deleted Successfully");
		}
		else {
			System.out.println("This Id Doesn't Exists.");
		}
		
	}
	
	static boolean check(int id,Statement stmt) throws SQLException
	{
		String select = "select * from doctor  where Id='" + id+ "' ";
		ResultSet rs = stmt.executeQuery(select);
		
		if(rs.next())
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
