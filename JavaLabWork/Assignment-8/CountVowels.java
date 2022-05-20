package Assignment_8;

import java.util.Scanner;

public class CountVowels {
	
	static void countVowels(String s)
	{
		int count=0;
		int len = s.length();
		for(int i=0; i<len; i++)
		{
			char ch = s.charAt(i);
			char lower = Character.toLowerCase(ch);
			if(lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u' )
			{
				count++;
			}
		}
		System.out.println("No. of Vowels in a String are : " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		countVowels(str);

	}

}

//Output:
//	Enter a String : 
//	India is my Country
//	No. of Vowels in a String are : 6
