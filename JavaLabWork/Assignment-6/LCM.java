package Assignment_6;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator and Denominator");
		int numr = sc.nextInt();
		int deno = sc.nextInt();
		System.out.println("Enter the LCM : ");
		int lcm = sc.nextInt();
		int x;
		
		x=lcm/(numr*deno);
		
		int num1 = numr * x;
		int num2 = deno * x;
		System.out.println("The First number is : " +num1);
		System.out.println("The Second number is : " +num2);
		if(num1<num2)
		{
			System.out.println("The Smallest number is : " +num1);
		}
		else {
			System.out.println("The Smallest number is : " +num2);
		}

	}

}

//Output :
//	Enter the Numerator and Denominator
//	3
//	4
//	Enter the LCM : 
//	240
//	The First number is : 60
//	The Second number is : 80
//	The Smallest number is : 60

