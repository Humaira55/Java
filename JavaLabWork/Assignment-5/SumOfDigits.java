package Assignment_5;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>'0' && str.charAt(i)<='9')
			{
				sum = sum + str.charAt(i)-'0';
			}
		}
		System.out.println("The sum of digits are : " +sum);

	}

}

//Output :
//	Enter a String
//	hhk45bj32
//	The sum of digits are : 14
