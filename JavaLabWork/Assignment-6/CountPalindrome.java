package Assignment_6;

import java.util.Scanner;
public class CountPalindrome {
	
	static int isPalindrome(String s)
	{
		String lower = s.toLowerCase();
		int len = lower.length();
		for(int i=0; i<=len/2; i++)
		{
			if(lower.charAt(i) != lower.charAt(len-1-i))
			{
				return -1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		int count = 0;
		String[] a = str.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			if(isPalindrome(a[i])==1)
			{
				count = count +1;
			}
		}
		System.out.println(count);				
	}
}

//Output:
//	Enter a string : 
//		hi madam we are listening pop music of bob marley
//		3
