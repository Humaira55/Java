package Assignment_3;

import java.util.Scanner;

public class DaysMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean quite = false;
		
		do {
			System.out.println("Enter the choice between 1 to 7");
			System.out.println("Press 0 to quite");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Monday");
					  break;
					  
			case 2 : System.out.println("Tuesday");
			  		 break;
			  
			case 3 : System.out.println("Wednesday");
			  		 break;
			  
			case 4 : System.out.println("Thursday");
			  		 break;
			  
			case 5 : System.out.println("Friday");
			  		 break;
			  
			case 6 : System.out.println("Weekend");
			  		 break;
			  
			case 7 : System.out.println("Weekend");
			  		 break;
			  
			case 0 : quite = true;
			  		 break;
			  
			default : System.out.println("Wrong Choice");
			  		  break;
			}
				System.out.println("");
		}while(!quite);
			System.out.println("Have a Nice day!");
			
		}

	}

//Output:
//	
//	Enter the choice between 1 to 7
//	Press 0 to quite
//	5
//	Friday
//
//	Enter the choice between 1 to 7
//	Press 0 to quite
//	0
//
//	Have a Nice day!

