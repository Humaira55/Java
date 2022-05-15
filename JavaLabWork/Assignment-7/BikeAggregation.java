package Assignment_7;

import java.util.Scanner;


public class BikeAggregation {

	public static void main(String[] args) {
		

		Bike b = new Factory().getBike();	
		//String fact = new Factory().carname;
		Wheel wh = new Wheel();
		
		
		if(b!= null)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Hourse Power :");
			int hoursepow = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Rider Name :");
			String ridername = sc.nextLine();
			
			System.out.println("Enter the License No. :");
			int licenseno = sc.nextInt();
						
			Engine e1 = new Engine(b.name, hoursepow);
			wh.getWheel();
			e1.EngineStart();
			
			Rider r = new Rider(ridername, licenseno);
			r.ride(b);
			
			e1.EngineStop();
					
		}
		else {
			System.out.println("Bike is not Available");
		}
	}

}

//Output:
//	Enter a Bike Name : 
//		suzuki
//		Bike Name : suzuki
//		Enter the Hourse Power :
//		12
//		Enter the Rider Name :
//		Humaira
//		Enter the License No. :
//		1234
//		The Bike Name is : suzuki and Hourse Power is : 12
//		Enter the Wheel Name :
//		seat
//		Enter the Wheel Radius :
//		3
//		Wheel Data :  Name - seat  Radius - 3
//		Engine is Starting to start the suzuki
//		The Rider Name is : Humaira and License No is : 1234
//		Suzuki is Starting..
//		Suzuki is Moving..
//		Suzuki gets the Break..
//		Suzuki is Stoping..
//		Engine is Stoping to stop the suzuki

	
