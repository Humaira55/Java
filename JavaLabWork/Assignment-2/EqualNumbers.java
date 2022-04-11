package Assignment_2;
import java.util.Scanner;
public class EqualNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("All numbers are same");
		}
		else if(a!=b && b!=c && a!=c )
		{
			System.out.println("All numbers are Different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}

	}

}
