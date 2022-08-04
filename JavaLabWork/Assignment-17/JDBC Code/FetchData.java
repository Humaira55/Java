import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {
	
	void fetchData() throws ClassNotFoundException, SQLException
	{

		String url = "jdbc:mysql://localhost:3306/hospital";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection cn = null;
		PreparedStatement pstmt = null;
		
		String query = "select * from doctor";
		
		Class.forName(driver);                  
		
		cn = DriverManager.getConnection(url, "root", "password");
		
		pstmt = cn.prepareStatement(query);
		
		ResultSet rs = pstmt.executeQuery(query);
		
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getNString(2);
			double salary = rs.getDouble(3);
			
			System.out.println(id + " " + name + " " + salary );
		}
	}

}
