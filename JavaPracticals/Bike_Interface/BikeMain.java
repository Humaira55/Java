package Bike_Interface;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
Bike b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bike name : ");
		String bname = sc.nextLine();
		
		if(bname.equalsIgnoreCase("unicorn" ))
		{
			 b= new HondaUnicorn();
			 b.start();
			 b.move();
			 b.stop();
			 
		}
		
		else if (bname.equalsIgnoreCase("apache"))
		{
			 b= new ApacheRTR();
			 b.start();
			 b.move();
			 b.stop();
		}
		
		else
		{
			System.out.println("Bike not available ");
		}
		
		sc.close();
	
		

	}

}
