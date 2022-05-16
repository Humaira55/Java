//Write a pgm to display a sum of all digits in a alphanumeric string.

package Alphanemeric_string;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str= sc.nextLine();
		
		
		for(int i=0; i<str.length(); i++)
		{
	//		char a = str.charAt(i);
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				sum+=(str.charAt(i)-'0');
			}
		}

		System.out.println("The sum of the digits are : " + sum);

	}

}
