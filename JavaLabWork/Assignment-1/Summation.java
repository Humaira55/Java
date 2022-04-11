import java.util.Scanner;
public class Summation {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number : ");
		int n = sc.nextInt();
		while(n>0)
		{
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("Sum of the digits : " +sum);
	}

}
