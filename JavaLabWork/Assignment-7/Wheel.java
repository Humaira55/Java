package Assignment_7;

import java.util.Scanner;

public class Wheel {
	
	void getWheel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Wheel Name :");
		String wheelname = sc.nextLine();
		System.out.println("Enter the Wheel Radius :");
		int wheelradius = sc.nextInt();
		
		System.out.println("Wheel Data : " + " Name - " + wheelname +"  " + "Radius - " + wheelradius);
	}

}
