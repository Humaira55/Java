package Assignment_7;

import java.util.Scanner;

public class Factory {
	String typeOfCar;
	String carname;
	
	Bike getBike()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Bike Name : ");
		carname = sc.nextLine();
		if(carname.equalsIgnoreCase("bmw"))
		{
			return new BMW(carname, null, null);
			
		}
		else if(carname.equalsIgnoreCase("suzuki"))
		{
			return new Suzuki(carname, null, null);
		}
		else {
			return null;
		}
	}
	
	

}
