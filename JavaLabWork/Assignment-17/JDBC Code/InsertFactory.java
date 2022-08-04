import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertFactory {
	
	void insert() throws ClassNotFoundException, SQLException
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
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter Doctor Id : ");
		int id = sc1.nextInt();
		
		String insert_query = "INSERT INTO `doctor`(`Id`,`Name`,`Salary`)VALUES(?,?,?)";
		
		pstmt = cn.prepareStatement(insert_query);
		
		if(check(id,stmt)==false)
		{
			System.out.println("Enter Doctor Name : ");
			String name = sc2.nextLine();
			
			System.out.println("Enter Doctor Salary : ");
			int salary = sc1.nextInt();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, salary);
			
			pstmt.executeUpdate();
			System.out.println("Data inserted Successfully..");
		}
		else {
			System.out.println("This Id already Available");
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
