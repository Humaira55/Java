package Assignment_9;

import java.util.Scanner;

public class RooftopCafeFactory {
	
	RooftopPoolCafe getResturant()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In which Resturant you wanted to go ?");
		String name = sc.nextLine();
		
		CustomerName c;
		c = new CustomerName();
		
		if(name.equalsIgnoreCase("Babar"))
		{
			return new BabarCafe(c);
		}
		else if(name.equalsIgnoreCase("Rustom"))
		{
			return new RustomCafe(c);
		}
		else {
			return null;
		}
	}
	
	
	
	
	

}
