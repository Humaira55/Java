package Assignment_2;

import java.util.Scanner;

public class NaturalNumberAddition {
	static double sum = 0;
    static double sign = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n= sc.nextInt();
		
		for(int i=2; i<=n; i++)
		{
			sum += sign * 1/i;
			sign = -1 *sign;
		}
		
		System.out.println("Sum of n terms in series is : " + (1+ sum));

	}

}
