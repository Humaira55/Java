package Assignment_12;

import java.util.Scanner;

public class MissingNumber {
	
	static void FindMissingNumber(int[] a,int n)
	{
		int sumAll = (n*(n+1))/2;
		int sumOfArray = 0;
		
		for(int i=0; i<n-1; i++)
		{
			sumOfArray += a[i];
		}
		
		int missingNum = sumAll - sumOfArray;
		System.out.println("Missing number is: "+missingNum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length of array : ");
	    int n = sc.nextInt();
	    int inpuArray[] = new int[n];
	    System.out.println("Enter " + (n-1) + " numbers: ");
	    for(int i=0; i<=n-2; i++) {
	       inpuArray[i] = sc.nextInt();
	    }
	    FindMissingNumber(inpuArray, n);

	}

}

//Output :
//	Enter the length of array : 
//	6
//	Enter 5 numbers: 
//	1
//	2
//	3
//	5
//	6
//	Missing number is: 4

	
