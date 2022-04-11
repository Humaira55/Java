import java.util.Scanner;

public class Factorial {
	
	static int isPerfect(int n)
	{
		int sum=0;
		for(int i=1; i<=n-1; i++)
		{	
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range");
		int ll = sc.nextInt();
		int ul = sc.nextInt();		
		
		for(int i=ll; i<=ul; i++)
		{
			if(isPerfect(i)==1)
			{
				for(int f=1; f<=i; f++)
				fact = fact*f;
				System.out.println(fact);
				
			}
			
		}

	}

}
