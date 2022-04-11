package Assignment_2;
//Write a program to compute the cosine of x. The user should supply x and a positive integer n. We compute the cosine of x using 
//the series and the computation should use all terms in the series up through the term involving xn cos x = 1 - x2/2! + x4/4! - x6/6! -.....

import java.util.Scanner;
public class CosineX {
	
	static int sign = -1;
	static int sum=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i+=2)
		{
			int fact=1;
			int s= 1;
			for(int j=1; j<=i; j++)
			{
				s=s*x;
			    fact = fact * i;
			}
			
			sum += sign*s/fact;
			 sign = -1 * sign;
			
		}
		System.out.println("cos" + x + "=" + (1+sum));

	}

}
