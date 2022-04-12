package Switch;

import java.util.Scanner;

public class BuzzPosituveEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean quite = false;
		
		do {
			System.out.println("Enter a Choice");
			System.out.println("1. To check Buzz or not");
			System.out.println("2. To check Positive or Negative");
			System.out.println("3. To check Even or odd");
			System.out.println("Press 0 to Quite");
			choice = sc.nextInt();
			int num;
			
			switch(choice)
			{
			case 1 : System.out.println("Enter a number");
					 num = sc.nextInt();
					 if(num%10 == 7 || num%7 == 0)
					 {
						 System.out.println(num + " is a Buzz number");
					 }
					 else
					 {
						 System.out.println(num + " is not a Buzz number");
					 }
					 break;
					 
			case 2 : System.out.println("Enter a number");
					 num = sc.nextInt();
					 if(num>0)
					 {
						 System.out.println(num + " is a Positive Number");
					 }
					 else if(num<0)
					 {
						 System.out.println(num + " is a Negative number");
					 }
					 else {
						 System.out.println("Entered Number is zero");
					 }
					 break;
					 
			case 3 : System.out.println("Enter a number");
				     num = sc.nextInt();
					 if(num%2 == 0)
					 {
						 System.out.println(num + " is a Even number");
					 }
					 else
					 {
						 System.out.println(num + " is a Odd number");
					 }
					 break;
					 
			case 0 : quite = true;
				 	 break;
				 	 
			default : System.out.println("Wrong Choice");
					  break;
			}
					System.out.println("");
			}while(!quite);
				System.out.println("Thanks for Checking..");
		}
		

	}


