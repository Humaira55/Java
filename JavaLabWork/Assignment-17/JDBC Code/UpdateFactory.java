import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateFactory {
	
	void update() throws ClassNotFoundException, SQLException
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
		
		System.out.println("Enter the Choice");
		System.out.println("1. Name Update");
		System.out.println("2. Salary Update");
		int ch = sc1.nextInt();
		
		System.out.println("Enter Doctor Id : ");
		int id = sc1.nextInt();
		
		switch(ch)
		{
		case 1 : nameUpdate(cn, stmt, sc2, id);
		break;
		
		case 2 : salaryUpdate(cn, stmt, sc2, id);
		break;
		
		default : System.out.println("Wrong Choice");
		}
		
	}

	private void nameUpdate(Connection cn, Statement stmt, Scanner sc2, int id) throws SQLException {
		PreparedStatement pstmt;
		String update_query = "update doctor set Name=? where Id=?";
		
		pstmt = cn.prepareStatement(update_query);
		
		
		if(check(id,stmt)==true)
		{
			System.out.println("Enter name to update");
			String name = sc2.nextLine();
			
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
			System.out.println("Data updated Successfully..");
		}
		else		{
			System.out.println("This Id Not Available");
		}
	}
	
	private void salaryUpdate(Connection cn, Statement stmt, Scanner sc1, int id) throws SQLException {
		PreparedStatement pstmt;
		String update_query = "update doctor set Salary=? where Id=?";
		
		pstmt = cn.prepareStatement(update_query);
		
		
		if(check(id,stmt)==true)
		{
			System.out.println("Enter Salary to update");
			int salary = sc1.nextInt();
			
			pstmt.setInt(1, salary);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
			System.out.println("Data updated Successfully..");
		}
		else		{
			System.out.println("This Id Not Available");
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
