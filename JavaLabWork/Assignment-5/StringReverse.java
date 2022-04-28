package Assignment_5;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		String[] a = str.split(" ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] + " ");
		}
		
		sc.close();

	}

}

//Output :
//	Enter a String
//	I am a Student
//	Student a am I
