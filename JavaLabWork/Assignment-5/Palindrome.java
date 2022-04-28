package Assignment_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}

		if(str.equals(rev))
		{
			System.out.println(str + " is Palindrome");
		}
		else {
			System.out.println(str + " is not a Palindrome");
		}
	}

}

//Output :
//	Enter a String
//	MOM
//	MOM is Palindrome
