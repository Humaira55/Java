package Array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Enter the length of an Array : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		//sc.nextLine();
		
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=len-1; j>=0; j--)
		{
			System.out.println(arr[j]);
		}
		
	}

}
