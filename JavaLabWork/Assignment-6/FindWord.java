package Assignment_6;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		String str = "We resolve to be brave. We resolve to be good. We resolve to uphold the law according to our oath";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = sc.nextLine();
		String a[] = str.split(" ");
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i].equals(word))
			{
				count = count + 1;
			}
		}
		System.out.println("The Occurence of " + word + " in a String is : " + count);
		 

	}

}

//Output:
//	Enter the word : 
//	resolve
//	The Occurence of resolve in a String is : 3
