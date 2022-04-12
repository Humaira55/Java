package Switch;
import java.util.Scanner;

public class BankDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		float balance = 0f;
		float amount = 0f;
		boolean quite = false;
		do {
			System.out.println("Enter the Choice : ");
			System.out.println("1. Credit the Amount");
			System.out.println("2. Withdraw the Amount");
			System.out.println("3. Display the Balane");
			System.out.println("Press 0 for quite");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Enter the amount to credit");
					 amount = sc.nextFloat();
					 if(amount<=0)
					 {
						 System.out.println("Enter the valid amount");
					 }
					 else {
						 balance += amount;
						 System.out.println("Balance " +amount+ "is credited.");
					 }
					 break;
					 
					 
			case 2 : System.out.println("Enter the amount to Withdraw");
					 amount = sc.nextFloat();
					 if(amount<=0 || amount>balance)
					 {
						 System.out.println("You account balance is low.");
					 }
					 else {
						 balance -= amount;
						 System.out.println("Balance " +amount+ " is debited.");
					 }
					 break;
					 
			case 3 : System.out.println("Your account balance is : " +balance);
					 break;
			
			case 0 : quite = true;
					 break;
					 
			default : System.out.println("Wrong choice");
					  break;
			}
				System.out.println("");
		}
			while(!quite);
				System.out.println("Thanks for Choosing our Bank!");
		}

	}


