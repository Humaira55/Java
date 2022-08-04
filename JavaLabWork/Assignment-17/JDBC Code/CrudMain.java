import java.sql.SQLException;
import java.util.Scanner;

public class CrudMain {

	public static void main(String[] args) {
		
		
		InsertFactory insertFactory = new InsertFactory();
		UpdateFactory updateFactory = new UpdateFactory();
		DeleteFactory deleteFactory = new DeleteFactory();
		FetchData fetch = new FetchData();
		
		try {
			
			Scanner sc = new Scanner(System.in);
			boolean quite = false;
			int ch;
			
			do {
				
				System.out.println("Enter the Choice : ");
				System.out.println("1. Insert the Data");
				System.out.println("2. Update the Data");
				System.out.println("3. Delete the Data");
				System.out.println("4. Fetch the Data");
				System.out.println("0. Quite");
				ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 : insertFactory.insert();
					break;
					
					case 2 : updateFactory.update();
					break;
					
					case 3 : deleteFactory.delete();
					break;
					
					case 4 : fetch.fetchData();
					break;
					
					case 0 : System.out.println("Thank You!");
							 quite = true;
					break;
					
					default : System.out.println("Wrong choice");
								
				}

				System.out.println();
						
			}while(!quite);
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
}
