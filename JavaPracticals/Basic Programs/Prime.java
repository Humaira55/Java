import java.util.Scanner;

public class Prime {
	
	static int checkPrime(int n) {
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkPrime(num));

	}

}
