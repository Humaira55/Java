package Assignment_8;

import java.util.Scanner;

public class DuplicateArray {
	
	static int Duplicate(int a[], int len)
	{
		int arr2[] = new int[len];
		int add=0;

		for(int i=0; i<len-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				arr2[add++] = a[i];
			}
		}
		
		arr2[add++] = a[len-1];
		
		for(int i=0; i<add; i++)
		{
			a[i] = arr2[i];
		}
		
		return add;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array : ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Enter the Elements of an Array : ");
		for(int i=0; i<length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		length = Duplicate(arr,length);
		System.out.println("Array after Removing Duplicate Elements : ");
		
		for(int i=0; i<length; i++)
		{
			System.out.println(arr[i] + " ");
		}

	}

}

//Output:
//	Enter the length of an Array : 
//		5
//		Enter the Elements of an Array : 
//		1
//		1
//		2
//		2
//		3
//		Array after Removing Duplicate Elements : 
//		1 
//		2 
//		3 

