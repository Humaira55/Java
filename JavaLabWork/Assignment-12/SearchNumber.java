package Assignment_12;

import java.util.Scanner;

public class SearchNumber {
	
	static int search(int[] a, int num)
	{
		int len = a.length;
		for(int i=0; i<len; i++)
		{
			if(a[i] == num)
			{
				return i+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array : ");
		int len = sc.nextInt();
		
		System.out.println("Enter the Elements of an Aray : ");
		int arr[] = new int[len];
		
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Element to serach : ");
		int find = sc.nextInt();
		
		if(search(arr, find) == 0)
		{
			System.out.println("Sorry! This element doesn't exists..");
		}
		else {
			System.out.println("The element found at the position : " + search(arr, find));
		}
	}

}

//Output :
//	Enter the length of an Array : 
//		6
//		Enter the Elements of an Aray : 
//		2
//		5
//		4
//		9
//		7
//		3
//		Enter the Element to serach : 
//		9
//		The element found at the position : 4
