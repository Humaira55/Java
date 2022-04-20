//Java pgm to check Alphabet using Ternary operator

import java.util.Scanner;
public class AlphabetTernaryOpr {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
	    a = sc.next().charAt(0);
		
		String check = ((a>='a' && a<='z') || (a>='A' && a<='Z'))
				? a + " is an Alphabet" : a+ " is not an Alphabet";
		
		System.out.println(check);
	}

}
