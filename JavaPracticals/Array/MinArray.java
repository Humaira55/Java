package Array;

public class MinArray {
	
	static int min=9;
	static int max=3;
	
	static void CheckMin(int[] arr)
	{
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value : " +min);
	}
	
	static void CheckMax(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value : " +max);
	}

	public static void main(String[] args) {
		
		int[] arr1 = {6,2,3,4}; 
		
		CheckMin(arr1);
		CheckMax(arr1);
	}

}
